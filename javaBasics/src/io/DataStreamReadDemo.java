package io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataStreamReadDemo {

	public static void main(String[] args) {
		try (DataInputStream in = new DataInputStream(new FileInputStream("files/numbers.data"));) {
			int a  ;
			long b  ;
			short c  ;
			
			a = in.readInt();
			b = in.readLong();
			c = in.readShort();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
