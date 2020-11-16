package oop;

public class WLine extends Line {
	private int width;
 WLine(int length, int width){
	 super(length);
	 this.width = width;
 }
 
 public void draw() {
	 for(int i = 0; i < width ; i++ ) {
		 super.draw();
	 }
 }
 
 public static void main(String[] args) {
	Line l1 = new Line(5);
	WLine l2 = new WLine(3,3);
	l1.draw();
	l2.draw();
}
}
