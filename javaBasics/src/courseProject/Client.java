package courseProject;

public class Client {
	private int id;
	private String name;
	private float balance;
	private Account[] accounts;
	private float commissionRate;
	private float interestRate;
	private Logger logger;
	
	public Client(int id, String name, float balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.commissionRate = 0;
		this.interestRate = 0;
		this.accounts = new Account[5];
		this.logger = new Logger("New account") ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public Account[] getAccounts() {
		return accounts;
	}
	
	


}

