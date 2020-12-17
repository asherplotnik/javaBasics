package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class ReadBinaryFile {

	public static void main(String[] args) {
		File file = new File("files/image.jpg");
		File file2  = new File("files/fileCopy.jpg");
		
		try (	
				BufferedInputStream in = new BufferedInputStream( new FileInputStream(file)); 
				BufferedOutputStream out = new BufferedOutputStream( new FileOutputStream(file2))
			) {
			long ts1 = System.currentTimeMillis();
			int b = in.read();
			while(b != -1) {
				out.write(b);
				 b = in.read();
			}
			long ts2 = System.currentTimeMillis();
			System.out.println("Done!!! " + (ts2 - ts1));
			
		} catch ( IOException e) {
			e.printStackTrace();
		}
		
	}

}
