package FactoryMethod;

import Excel.ExcelFactory;
import Pdf.PdfFactory;
import Word.WordDocumentFactory;

public class Main {
	public static void main(String args[]) {
		DocumentFactory wordFact = new WordDocumentFactory();
		Document Word = wordFact.createDocument();
		Word.Open();
		
		DocumentFactory pdfFact = new PdfFactory();
		Document pdf = pdfFact.createDocument();
		pdf.Open();
		
		DocumentFactory excelFact = new ExcelFactory();
		Document excel = excelFact.createDocument();
		excel.Open();
		
		
	}
	
}
