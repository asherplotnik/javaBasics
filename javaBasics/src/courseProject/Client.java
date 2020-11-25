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
		this.logger = new Logger(null);
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

	public void addAccount(Account account) {
		int i;
		for (i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = account;
				logger.log(new Log(this.id, "account added:" + account.getId(), account.getBalance()));
				break;
			}
		}
		if (i == 5) {
			System.out.println("No account Available");
		}
		;
	}

	public Account getAccount(int id) {
		return accounts[id];
	}

	public void removeAccount(int id) {
		logger.log(new Log(this.id, "account removed:" + accounts[id], 0.0F));
		accounts[id] = null;
	}

	public void deposite(float amount) {
		this.balance += amount - amount * commissionRate;
		logger.log(new Log(this.id, "Deposite to balance-", amount));
	}

	public void withdraw(float amount) {
		if (amount + amount * commissionRate >= 0) {
			this.balance -= amount + amount * commissionRate;
			logger.log(new Log(this.id, "Withdraw from balance-", amount));
		} else {
			System.out.println("Not enough funds to make transactions.");
		}
	}

	public void autoUpdate() {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				float newBalance = accounts[i].getBalance() + accounts[i].getBalance() * interestRate;
				accounts[i].setBalance(newBalance);
			//	logger.makeLogEntry("auto update interest ", this.id, newBalance);
				logger.log(new Log(this.id, "auto update interest ", newBalance));
			}
		}
	}

	public float getFortune() {
		float sum = this.balance;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				sum += accounts[i].getBalance();
			}
		}
		return sum;
	}

}
