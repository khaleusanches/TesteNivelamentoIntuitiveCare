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
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String url = "https://www.gov.br/ans/pt-br/acesso-a-informacao/participacao-da-sociedade/atualizacao-do-rol-de-procedimentos";
        Scrapper scrapper = new Scrapper(url, "a.internal-link");
        PDFDownloader downloader = new PDFDownloader();
        Compactor compactor = new Compactor();

        try {
            URL url_anexo_I = scrapper.getUrlAnexo("Anexo I.");
            URL url_anexo_II = scrapper.getUrlAnexo("Anexo II.");

            File anexo_I = new File("anexo_I.pdf");
            File anexo_II = new File("anexo_II.pdf");

            downloader.downloadFile(url_anexo_I, anexo_I);
            downloader.downloadFile(url_anexo_II, anexo_II);
            compactor.compact(List.of(anexo_I, anexo_II));
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}