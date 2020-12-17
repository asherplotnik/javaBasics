package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadTextFileBuffer {

	public static void main(String[] args) {
		File file = new File("files/letter.txt");	
		try (
				BufferedReader in = new BufferedReader(new FileReader(file));
				BufferedWriter out = new BufferedWriter(new FileWriter("files/letterCopy.txt"));
				PrintWriter prt = new PrintWriter(new FileWriter("files/letterPrint.txt"));  //accept any type and convert to string
				
			){
			
			String line = in.readLine();
			while (line != null) {
				out.write(line);
				out.newLine();
				prt.println(line);
				line = in.readLine();
			}
			
			
			
			System.out.println("Done!!");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
