package org.example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class PDFDownloader {
    public void downloadFile (URL url_anexo, File anexo) {
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
}
