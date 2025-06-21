package Excel;

import FactoryMethod.Document;

public class ExcelDocument implements Document{
	@Override
	public void Open() {
		System.out.println("Opening ExcelDocument....\n");
	}
}
