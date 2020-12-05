package homeAdvancedClass;

public class Car extends Vehicle {

	public Car(int number, Location location) {
		super(number, location);
	}

	@Override
	public void goTO(Location location) {
		//setLocation(location);
		this.location.setX(location.getX());
		this.location.setY(location.getY());
		//System.out.println("im driving to location: (" + location.getX() + ", " + location.getY());
	}
	
	public void print() {
		System.out.println("number: "  + this.getNumber() + " locationX: " + this.getLocation().getX()+ " locationY: " +this.getLocation().getY());
	}
}
