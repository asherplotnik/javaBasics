package myExceptions;

public class Triangle {
	private int a;
	private int b;
	private int c;
	public Triangle(int a, int b, int c) throws NotATriangleException {
		set(a,b,c);
	}
	public Triangle() throws NotATriangleException{
		set(0,0,0);
	}
	public void set(int a, int b, int c) throws  NotATriangleException{
		this.a = a;
		this.b = b;
		this.c = c;
		
		if( a > b+c || b > a+c || c > a+b) {
			throw new NotATriangleException("Not A Triangle!!!");
		}
	}
	@Override
	public String toString() {
		return "("+ a +", " + b +", " + c + ")" ;
	}
	
	

}
