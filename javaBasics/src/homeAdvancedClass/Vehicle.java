package homeAdvancedClass;

public abstract class Vehicle implements Navigator {
	private final int number;
	protected Location location;
	public Vehicle(int number, Location loctaion) {
		this.number = number;
		this.location = loctaion;
	}
	
//	public void setLocation(Location location) {
//		this.location = location;
//	}
	public int getNumber() {
		return number;
	}
	public Location getLocation() {
		return location;
	}
	
	public abstract void print();

	
}
