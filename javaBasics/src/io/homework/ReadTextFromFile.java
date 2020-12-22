package io.homework;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFromFile {

	public static void main(String[] args) {
		try(
				BufferedReader  in = new BufferedReader(new FileReader("files/letter.txt"));
				//		BufferedWriter  out = new BufferedWriter(new FileWriter("files/letterCopy.txt"));
			){
			String line = in.readLine();
			while (line != null) {
		//		out.write(line);
		//		out.newLine();
				System.out.println(line);
				line = in.readLine();
			}
			//System.out.println("done writing from letter.txt to letterCopy.txt!!!");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
