package enums;

import java.util.Scanner;

public class Test {

	public Test() {
	}

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			boolean b = true;
			while (b) {
				try {
					System.out.println("Enter planet name");
					String p = scan.next();
					Planet p1 = Planet.valueOf(p);
					System.out.println("mass:" + p1.getMass());
					System.out.println("orbit:" + p1.getOrbit());
					b = false;
				} catch (IllegalArgumentException e) {
					System.out.println("Planet dont exists!!!");
					b = true;
				}

			}
		}

	}

}
