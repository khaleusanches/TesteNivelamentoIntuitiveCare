package org.example;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String url = "https://www.gov.br/ans/pt-br/acesso-a-informacao/participacao-da-sociedade/atualizacao-do-rol-de-procedimentos";
        int leitor = 0;
        try {
            Document page = Jsoup.connect(url).get();
            Elements elements = page.select("a.internal-link");

            URL url_anexo_I = getUrlAnexo(elements, "Anexo I.");
            URL url_anexo_II = getUrlAnexo(elements, "Anexo II.");
            File anexo_I = new File("anexo_I.pdf");
            File anexo_II = new File("anexo_II.pdf");
            downloadFile(url_anexo_I, anexo_I);
            downloadFile(url_anexo_II, anexo_II);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private static void downloadFile (URL url_anexo, File anexo) {
        try{
            InputStream read_anexo = url_anexo.openStream();
            FileOutputStream copy_anexo = new FileOutputStream(anexo);
            for (int copy = read_anexo.read(); copy > -1; copy = read_anexo.read()) {
                copy_anexo.write(copy);
            }
            read_anexo.close();
            copy_anexo.close();
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    private static URL getUrlAnexo(Elements elements, String text) {
        URL url_anexo;
        try {
            for (Element element : elements) {
                if(element.text().equals(text)) {
                    url_anexo = new URL(element.attr("abs:href"));
                    return url_anexo;
                }
            }
            return null;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}