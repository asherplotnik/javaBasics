package myExceptions;

public class Point {
	public static final int MAX = 100;
	public static final int MIN = 0;
	int x = 0;
	int y = 0;
	
	public Point() {
		
	}

	public Point(int x, int y) throws OutOfBoundPointException {

		this.setX(x);
		this.setY(y);

	}

	public int getX() {
		return x;
	}

	public void setX(int x) throws OutOfBoundPointException {
		if (x < MIN || x > MAX) {
			throw new OutOfBoundPointException("Point out of range!!!");
		}
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) throws OutOfBoundPointException {
		if (y < MIN || y > MAX) {
			throw new OutOfBoundPointException("Point out of range!!!");
		}
		this.y = y;
	}

	public void setPoint(int x, int y) {
		try {

			this.setX(x);
			this.setY(y);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public String toString() {

		return ("(" + x + ", " + y + ")");
	}

}
