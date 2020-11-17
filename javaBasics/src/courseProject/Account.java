package courseProject;

public class Account {
	private int id;
	private float balance;

	public Account(int id, float balance) {
		this.id = id;
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
		// need to log the balance as well.
	}

	public int getId() {
		return id;
	}

}
