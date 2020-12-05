package myExceptions;


public class Point {
	int x = 0;
	int y = 0;
	public Point(int x, int y) {
		try {
			this.setX(x);
			this.setY(y);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public int getX() {
		return x;
	}
	public void setX(int x) throws OutOfBoundPointException{
		if (x < 0 || x > 100 ) {
			throw new OutOfBoundPointException("Point out of range!!!");
		}
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) throws OutOfBoundPointException{
		if (y < 0 || y > 100 ) {
			throw new OutOfBoundPointException("Point out of range!!!");
		}
		this.y = y;
	}
	public void setPoint(int x, int y) {
		try {
			
			this.setX(x);
			this.setY(y);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	@Override
	public String toString() {
		
		return ("("+ x + ", " + y+")");
	}
	
	
	
}
