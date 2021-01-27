package oop;

public class Pixel extends Point{
	private static final long serialVersionUID = 1L;
	private String color;
	public Pixel(int x, int  y, String color) {
		super(x,y);
		this.color = color;
	}
	
	public Pixel(int x, int y) {
		this(x,y,"black");
	}
	
	public Pixel(int val) {
		this(val,val,"black");
	}
	
	public Pixel() {
	
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void print() {
		System.out.println("x: " + getX() + " y: " + getY() + " color: " + color );
	}
	
	public static void main(String[] args) {
		Pixel p1 = new Pixel(4,5,"yellow");
		Pixel p2 = new Pixel(6,7);
		Pixel p3 = new Pixel();
		p1.print();
		p2.print();
		p3.print();
	}
	
	
	

}
