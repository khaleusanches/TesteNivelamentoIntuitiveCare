package org.example;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class CSVManipulator {
    String Name;

    public CSVManipulator(String name){
        Name = name + ".csv";
    }
    public void createCSV(ArrayList<String> collumns) throws IOException {
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(Name), StandardCharsets.UTF_8);
        for(String collumn : collumns){
            writer.write(collumn);
        }
        writer.write("\n");
        writer.close();
    }
    public void insertData(ArrayList<ArrayList<String>> lines) throws IOException {
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(Name, true), StandardCharsets.UTF_8);
        for(ArrayList<String> line : lines){
            for(String cell : line){
                writer.write(cell);
            }
            writer.write("\n");
        }
        writer.close();
    }
    public void convertPDFtoCSV(PDFManipulator pdfManipulator, int pagina_initial_number, int pagina_final_number) throws IOException {
        ArrayList<String> collumns = pdfManipulator.extractCollumns(pagina_initial_number);
        createCSV(collumns);
        for(int i = pagina_initial_number; i <= pagina_final_number; i++){
            ArrayList<ArrayList<String>> lines = pdfManipulator.extractLines(i);
            insertData(lines);
        }
    }

}
