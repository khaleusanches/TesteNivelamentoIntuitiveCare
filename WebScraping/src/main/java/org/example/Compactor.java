package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Compactor {
    public void compact(List<File> files){
        try{
            FileOutputStream archive_zipado = new FileOutputStream("anexos.zip");
            ZipOutputStream archives_zipados = new ZipOutputStream(archive_zipado);
            addFileToZip(files, archives_zipados);
            archives_zipados.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private void addFileToZip(List<File> files, ZipOutputStream archives_zipados) throws IOException {
        for (File file : files){
            FileInputStream copy_file = new FileInputStream(file);
            ZipEntry add_archive = new ZipEntry(file.getName());
            archives_zipados.putNextEntry(add_archive);
            for (int copy = copy_file.read(); copy > -1; copy = copy_file.read()) {
                archives_zipados.write(copy);
            }
            copy_file.close();
            archives_zipados.closeEntry();
        }
    }
}


