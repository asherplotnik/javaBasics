package oopEx;

public class Car {
		private int number;
		private int speed;

	public Car(int number , int speed) {
		setNumber(number);
		setSpeed(speed);
	}

	public int getNumber() {
		return number;
	}


	public int getSpeed() {
		return speed;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setSpeed(int speed) {
		if (speed >=0 && speed <=110) {
			this.speed = speed;
		} else {
			System.out.println("out of range speed default speed set to 0");
			this.speed = 0;
		}
	}

	@Override
	public String toString() {
		return "[" + number + " , "+ speed + " ]" ;
	}
	
}