package io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) {
		File file = new File("files/letter.txt");	
		try (FileReader in = new FileReader(file)){
			
			int c = in.read();
			while (c!=-1) {
				System.out.print((char)c);
				c = in.read();
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
