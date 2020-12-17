package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ProductEx {
	
	String name;
	double price;
	int barcode;
	
	public ProductEx() {
		this.name = null;
		this.price = 0;
		this.barcode = 0;
	}
	public ProductEx(String name, double price, int barcode) {
		this.name = name;
		this.price = price;
		this.barcode = barcode;
	}

	public void saveProduct() throws FileNotFoundException, IOException {
		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("files/exProduct.data")));) {
			out.writeUTF(name);
			out.writeDouble(price);
			out.writeInt(barcode);
		}
		
	}
	
	public void readProduct() throws FileNotFoundException, IOException{
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("files/exProduct.data")));){
			name = in.readUTF();
			price = in.readDouble();
			barcode = in.readInt();			
		}
	}
	
	public void print() {
		System.out.println("name:"+name);
		System.out.println("price:"+price);
		System.out.println("barcode:"+ barcode);
	}

	public static void main(String[] args) {
		
		ProductEx p1 = new ProductEx("chair",50,1234);
		try {
			p1.saveProduct();
			ProductEx p2  = new ProductEx();
		    p2.readProduct();
		    p2.print();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

}
