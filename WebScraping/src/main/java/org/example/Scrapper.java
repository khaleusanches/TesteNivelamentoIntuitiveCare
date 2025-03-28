package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Scrapper {
    private Document page;
    private Elements elements;

    public Scrapper(String url_page, String search_elements) {
        try {
            page = Jsoup.connect(url_page).get();
            elements = getElements(search_elements);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private Elements getElements(String class_name) {
        return page.select(class_name);
    }
    public URL getUrlAnexo(String text) {
        try {
            for (Element element : elements) {
                if(element.text().equals(text)) {
                    return new URL(element.attr("abs:href"));
                }
            }
            return null;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
