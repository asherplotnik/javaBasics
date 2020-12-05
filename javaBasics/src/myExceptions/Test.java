package myExceptions;

public class Test {

	public static void main(String[] args) {
		Car car = new Car();
		try {
			car.drive(30);
			car.drive(130);
		} catch (CarException e) {
			System.out.println("CarException");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("some other error");
			e.printStackTrace();
		}

		System.out.println("END");

	}

}