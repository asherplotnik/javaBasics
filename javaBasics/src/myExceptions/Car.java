package myExceptions;

public class Car {

	public static final int MAX_SPEED = 110;
	private int speed;

	public void drive(int speed) throws CarException {
		if (speed > MAX_SPEED) {
			throw new CarException("drive failed - " + speed + " is above max spedd allowed");
		}
		this.setSpeed(speed);
		System.out.println("car is moving at " + speed + " km/h");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
