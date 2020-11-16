package oop;

public class Order {
	String item;
	double price;
	int quantity;
	
	public Order(String item, double price, int quantity) {
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void printOrder() {
		System.out.println("your order: " + this.item +" "+ this.price +" "+ this.quantity + " total:" +  calculatePrice());
	}
	
	public double calculatePrice() {
		return (this.price * this.quantity);
	}
	
	
}
