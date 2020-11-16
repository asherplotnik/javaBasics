package oop;

public class Smartphone {
	String brand;
	double screenSize;
	int camera;
	int numberOfApps;
	
	
	public Smartphone(String brand, double screenSize, int camera, int numberOfApps) {
		this.brand = brand;
		this.screenSize = screenSize;
		this.camera = camera;
		this.numberOfApps = numberOfApps;
	}

	public void installApp() {
		this.numberOfApps++;
	}
	
	public void unInstallApp() {
		if (this.numberOfApps > 0) {
			this.numberOfApps--; 
		} else {
			System.out.println("No apps to uninstall!");
		}
	}
	
	public void print(){
		System.out.println("BRAND: "+ this.brand + " SCREENSIZE: "+this.screenSize +" CAMERA: " + this.camera + " number of apps: " + this.numberOfApps);
	}
	
}
