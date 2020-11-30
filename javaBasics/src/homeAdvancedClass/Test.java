package homeAdvancedClass;

public class Test {

	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = new Car(1,new Location(0,0));
		vehicles[1] = new Car(2,new Location(0,0));
		vehicles[2] = new AirPlane(3,new Location(0,0),"on-ground");
		
		for (int i = 0; i < vehicles.length; i++) {
			vehicles[i].goTO(new Location(i+2,i+2));
			vehicles[i].print();
		}
		
	}
	
}
