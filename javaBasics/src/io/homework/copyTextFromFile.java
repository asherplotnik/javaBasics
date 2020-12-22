package io.homework;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class copyTextFromFile {

	public static void main(String[] args) {
		try(
				BufferedReader  in = new BufferedReader(new FileReader("files/letter.txt"));
				PrintWriter  out = new PrintWriter(new FileWriter("files/letterCopy.txt",true));
			){
			String line = in.readLine();
			while (line != null) {
				out.println(line);
		//		System.out.println(line);
				line = in.readLine();
			}
			System.out.println("done writing from letter.txt to letterCopy.txt!!!");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
