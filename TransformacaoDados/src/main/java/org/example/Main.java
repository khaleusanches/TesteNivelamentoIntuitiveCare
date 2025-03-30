package org.example;

import org.apache.pdfbox.pdmodel.PDDocument;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PDDocument pdf_document = PDDocument.load(new File("anexo_I.pdf"));
        PDFManipulator pdfManipulator = new PDFManipulator(pdf_document);
        CSVManipulator csvManipulator = new CSVManipulator("Anexo_I");
        csvManipulator.convertPDFtoCSV(pdfManipulator, 3, pdf_document.getNumberOfPages());
    }
}
