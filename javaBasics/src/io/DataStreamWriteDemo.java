package io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamWriteDemo {

	public static void main(String[] args) {
		int a = 150;
		long b = 250;
		short c = 25;
		try (DataOutputStream out = new DataOutputStream(new FileOutputStream("files/numbers.data"));) {
			
			out.writeInt(a);
			out.writeLong(b);
			out.writeShort(c);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
