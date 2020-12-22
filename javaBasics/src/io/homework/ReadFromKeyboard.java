package io.homework;

import java.io.IOException;

public class ReadFromKeyboard {

	public static void main(String[] args) {
		
		try {
			String c="";
			int t;
			while ((t = System.in.read()) != 10) {
				c += (char)t;
			}
			System.out.println(c);
		} catch (IOException e) {
			System.err.println("An error has occurred");
			e.printStackTrace();
		}
	}

}
