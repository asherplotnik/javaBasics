package designPatterns.factory;

public class HtmlPrinter implements Printer {

	private String printerType;
	private String ink;
	
	

	public HtmlPrinter(String printerType, String ink) {
		this.printerType = printerType;
		this.ink = ink;
	}

	@Override
	public void print(String content) {
		System.out.println(printerType);
		System.out.println("</html>");
		System.out.println(content);
		System.out.println("</html>");
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
