package abstractClass;

public class Circle extends Shape{
	double radius;
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	

}
