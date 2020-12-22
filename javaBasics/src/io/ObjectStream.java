package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import oop.Point;

public class ObjectStream {

	public static void main(String[] args) {
		Point point1 = new Point(10,30);
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("files/objectFile.data")));){
			out.writeObject(point1);
			System.out.println("Saved to file");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("files/objectFile.data")));){
			 Point point2 = (Point)in.readObject();
			System.out.println(point2.getX()+", "+point2.getY());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
