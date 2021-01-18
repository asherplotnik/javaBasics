package designPatterns.factory;

public class PrinterFactory {
	
	public static Printer createPrinter(PrinterTypeEnum type) {
		Printer printer = null;
		switch(type) {
		case PLAIN_TEXT:
			printer = new PlainTextPrinter("plain printer", "color");
			break;
		case HTML:
			printer = new HtmlPrinter("HTML printer", "black");
			break;
		default:
			break;
		
		}
		return printer;
		
	}

}
