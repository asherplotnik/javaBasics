package homeAdvancedClass;

public class AirPlane extends Vehicle implements Flyer{
	String mode ="on-ground";
	
	  public AirPlane(int number, Location location, String mode) {
		  super(number,location); 
		  if (mode.equalsIgnoreCase("flying") ||  mode.equalsIgnoreCase("on-ground")) { 
		  		this.mode = mode.toLowerCase();
		  }
	  }
 

	@Override
	public void goTO(Location location) {
		if (this.mode.equalsIgnoreCase("on-ground")) {
			takeff();
		}
		//System.out.println("im flying to location: (" + location.getX() +", "+ location.getY());
		this.location.setX(location.getX());
		this.location.setY(location.getY());
	}

	@Override
	public void takeff() {
		this.mode = "flying";
		
	}

	@Override
	public void land() {
		this.mode = "on-ground";
		
	}

	public String getMode() {
		return mode;
	}
	
	public void print() {
		System.out.println("number: "  + this.getNumber() + " locationX: " + this.getLocation().getX()+ " locationY: " +this.getLocation().getY()  +" mode: " + this.getMode());
	}
	

}
