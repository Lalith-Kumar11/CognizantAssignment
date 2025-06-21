package Pdf;

import FactoryMethod.Document;
import FactoryMethod.DocumentFactory;

public class PdfFactory extends DocumentFactory{
	
	public Document createDocument() {
		System.out.println("Pdf Document Created");
		return new PdfDocument();
	}

}
