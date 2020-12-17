package oop;
import java.io.Serializable;
public class Point implements Serializable{
	private static final long serialVersionUID = 1L;
	private int y;
	private int x;
	public Point() {
		this(0);
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int val) {
		this(val, val);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	

}
