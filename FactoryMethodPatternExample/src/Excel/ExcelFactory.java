package Excel;

import FactoryMethod.Document;
import FactoryMethod.DocumentFactory;

public class ExcelFactory extends DocumentFactory{
	public Document createDocument() {
		System.out.println("Excel Document Created");
		return new ExcelDocument();
	}
}
