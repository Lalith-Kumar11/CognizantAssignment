package Word;

import FactoryMethod.Document;

public class WordDocument implements Document{
	@Override
	public void Open(){
		System.out.println("Opening Word Document....\n");
	}
}
