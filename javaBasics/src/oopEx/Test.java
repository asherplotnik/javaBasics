package oopEx;

public class Test {

	public static void main(String[] args) {
		Country c = new Country();
		// fill country with highways and highways with cars
		populateCountry(c);
		//print quantity of cars on all highways
		printCarsQuantityInCountry(c);
		//print quantity of cars on each highway
		//print busiest highway
		printCarsQuantityForHighway(c);
		//print average speed of cars in country
		printAverageSpeed(c);
		//print max speed  in country
		printMaxSpeed(c);
		//print the highway with max average speed
		printHighwayWithHighestAverageSpeed(c);
		
		
	}
	
	public static void populateCountry(Country c) {
		for (int i = 0 ; i< c.getHighways().length;i++) {
			c.getHighways()[i] = new Highway("highway" + i);
			c.getHighways()[i].populateHighway();
			c.getHighways()[i].printCars();
		}
	}
	
	public static void printCarsQuantityInCountry(Country c) {
		int sum = 0;
		for (Highway highway : c.getHighways()) {
			for(Car car: highway.getCars()) {
				if (car != null) 
				  sum ++; 
				else 
				  break;
			}
		}
		System.out.println("Number of cars on all highways is: " + sum);
	} 
	
	public static void printCarsQuantityForHighway(Country c) {
		int max = 0;
		String name = null;
		for (Highway highway : c.getHighways()) {
			int sum = 0;
			for(Car car: highway.getCars()) {
				if (car != null) 
				  sum ++; 
				else 
				  break;
			}
			if (max < sum) {
				max = sum;
				name = highway.getName();
			}
			System.out.println("Number of cars in " + highway.getName() +" is: " + sum);
		}	
		System.out.println("the busiest highway is : "+name);
	}
	
	public static void printAverageSpeed(Country c) {
		int sum = 0;
		double sumSpeed = 0;
		for (Highway highway : c.getHighways()) {
			for(Car car: highway.getCars()) {
				if (car != null) {
				  sum ++; 
			      sumSpeed += car.getSpeed();
				}
				else 
				  break;
			}
		}
		sumSpeed /= sum; 
		System.out.println("Average speed in the country is : " + sumSpeed);
	}
	
	public static void printMaxSpeed(Country c) {
		int max = 0;
		for (Highway highway : c.getHighways()) {
			for(Car car: highway.getCars()) {
				if (car != null) {
				  if (max < car.getSpeed()) {
					  max = car.getSpeed();
				  }
				}
				else 
				  break;
			}
		}
		System.out.println("Max speed in the country is : " + max);
	}
	
	public static void printHighwayWithHighestAverageSpeed(Country c) {
		double max = 0;
		String name = null;
		for (Highway highway : c.getHighways()) {
			int sum = 0;
			double sumSpeed = 0;
			for(Car car: highway.getCars()) {
				if (car != null) {
				  sum ++; 
			      sumSpeed += car.getSpeed();
				}
				else 
				  break;
			}
			sumSpeed /= sum; 
			if (max < sumSpeed) {
				max = sumSpeed;
				name = highway.getName();
			}
		}
		System.out.println("The max average speed per highway is : " + max + " in: " + name);
	}
	

	

}
