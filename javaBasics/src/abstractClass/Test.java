package abstractClass;

public class Test {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];
		shapes[0] = new Circle("white",5);
		shapes[1] = new Rectangle("red",2,3);
		shapes[2] = new Circle("blue",3);
		shapes[3] = new Rectangle("black",5,4);
	
	
		for( int i = 0 ; i<shapes.length;i++) {
			System.out.println(shapes[i].getClass().getSimpleName() + " area:"  +shapes[i].getArea());
		}
	}
}
