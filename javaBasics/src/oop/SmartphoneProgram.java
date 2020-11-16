package oop;

public class SmartphoneProgram {

	public static void main(String[] args) {
		Smartphone samsung = new Smartphone("Samsung", 5.6, 8, 3);
		samsung.installApp();
		samsung.unInstallApp();
		samsung.unInstallApp();
		
		samsung.print();
	}

}
