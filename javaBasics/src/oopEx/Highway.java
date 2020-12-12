package oopEx;

import java.util.Arrays;

public class Highway {
	private String name;
	private Car[] cars;

	public Highway(String name) {
		setName(name);
		cars = new Car[100];
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car[] getCars() {
		return cars;
	}
	
	public void printCars() {
		System.out.println(Arrays.toString(cars));
	}
	
	public void populateHighway() {
		int carClass = 0;
		int numberOfCars = (int)(Math.random()*95+6);
		for (int i = 0; i < numberOfCars; i++) {
			int speed = (int)(Math.random()*111);
			carClass = (int)(Math.random()*3);
			switch (carClass) {
			case 0: 
				cars[i] = new SportsCar(i, speed);
				break;
			case 1: 
				cars[i] = new FamilyCar(i, speed);
				break;
			case 2: 
				cars[i] = new Car(i, speed);
				break;
			default:
				cars[i] = new Car(i, speed);
			}
		}
	}
	
//	public static void main(String[] args) {
//		Highway h = new Highway("ayalon");
//		h.populateRandomCars();
//	}

}
