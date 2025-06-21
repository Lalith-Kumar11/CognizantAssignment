package Pdf;

import FactoryMethod.Document;

public class PdfDocument implements Document{
	public void Open() {
		System.out.println("Opening Pdf Document....\n");
	}
}
