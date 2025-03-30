package org.example;

import com.aspose.pdf.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import technology.tabula.Page;
import technology.tabula.Table;
import technology.tabula.ObjectExtractor;
import technology.tabula.RectangularTextContainer;
import technology.tabula.extractors.SpreadsheetExtractionAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class PDFManipulator {
    SpreadsheetExtractionAlgorithm table_detector;
    ObjectExtractor table_extractor;

    public PDFManipulator(PDDocument pdf_document) {
        table_extractor = new ObjectExtractor(pdf_document);
        table_detector = new SpreadsheetExtractionAlgorithm();
    }

    public ArrayList<String> extractCollumns(int pagina_initial_number) {
        Page pagina_atual = table_extractor.extract(pagina_initial_number);
        Table table = table_detector.extract(pagina_atual).getFirst();
        List<RectangularTextContainer> row_atual = table.getRows().getFirst();
        return extractLineCells(row_atual);
    }

    private ArrayList<String> extractLineCells(List<RectangularTextContainer> row_atual) {
        ArrayList<String> line = new ArrayList<String>();
        for(RectangularTextContainer cell_atual : row_atual){
            String txt = cell_atual.getText();
            if(cell_atual.getText().lines().count() > 1) {
                txt = " ";
                for (String parte_text : cell_atual.getText().split("\\R")) {
                    txt = txt + parte_text + " ";
                }
            }
            if(txt.contains(";")) txt = txt.replaceAll(";","");
            if(txt.equals("OD")) txt = "Seg. Odontológica";
            else if(txt.equals("AMB")) txt = "Seg. Ambulatorial";
            line.add(txt + ";");
        }
        return line;
    }


    public ArrayList<ArrayList<String>> extractLines(int pagina_initial_number){
        Page pagina_atual = table_extractor.extract(pagina_initial_number);
        List<Table> tables = table_detector.extract(pagina_atual);
        ArrayList<ArrayList<String>> lines = new ArrayList<ArrayList<String>>();
        for (Table table : tables) {
            for (List<RectangularTextContainer> row_atual : table.getRows()) {
                if (row_atual == table.getRows().getFirst()) continue;
                lines.add(extractLineCells(row_atual));
            }
        }
        return lines;
    }
}
