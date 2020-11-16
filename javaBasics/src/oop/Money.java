package oop;

public class Money {
	int dollars;
	int cents;

	public Money() {

	}

	public Money(int dollars, int cents) {
		add(dollars, cents);
	}

	public int getDollars() {
		return dollars;
	}

	public int getCents() {
		return cents;
	}

	public void add(int dollars, int cents) {		
		if (cents < 0 || dollars < 0) {
			System.out.println("Wrong Input!");
		} else {
			this.dollars += dollars;
			if (cents >= 100) {
				this.dollars += cents / 100;
				this.cents += cents % 100;
			}
		}
	}

	public void print() {

		System.out.println("Dollars : " + this.dollars + " cents" + this.cents);
	}

}
