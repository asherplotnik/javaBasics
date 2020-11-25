package abstractClass;

public class Rectangle extends Shape{
	
	private double width;
	private double length;
	
	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.length = height;
		
		
	}
	
	public double getArea() {
		return width * length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

}
