package Word;

import FactoryMethod.Document;
import FactoryMethod.DocumentFactory;

public class WordDocumentFactory extends DocumentFactory{
	public Document createDocument() {
		System.out.println("Word Document Created");
		return new WordDocument();
	}
}
