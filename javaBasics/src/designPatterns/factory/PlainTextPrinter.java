package designPatterns.factory;

public class PlainTextPrinter implements Printer {
	
	private String printerType;
	private String ink;
	
	

	public PlainTextPrinter(String printerType, String ink) {
		this.printerType = printerType;
		this.ink = ink;
	}

	@Override
	public void print(String content) {
		System.out.println(printerType);
		System.out.println("===================");
		System.out.println(content);
		System.out.println("===================");
	}

	@Override
	public String getPrinterType() {
		// TODO Auto-generated method stub
		return printerType;
	}

	@Override
	public String getPrinterInk() {
		// TODO Auto-generated method stub
		return ink;
	}

}
