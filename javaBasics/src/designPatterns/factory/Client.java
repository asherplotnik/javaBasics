package designPatterns.factory;

public class Client {

	public static void main(String[] args) {
		Printer printer;
		printer = PrinterFactory.createPrinter(PrinterTypeEnum.PLAIN_TEXT);
		printer.print("HELLO");
		printer = PrinterFactory.createPrinter(PrinterTypeEnum.HTML);
		printer.print("BYE");
	}

}
