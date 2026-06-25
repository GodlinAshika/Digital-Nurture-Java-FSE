package factory;

public class Main {

	public static void main(String[] args) {
		
		// simply replace WordFactory with PdfFactory or ExcelFactory
		DocumentFactory factory = new WordFactory();
		Document doc = factory.createDocument();

		doc.open();

	}

}
