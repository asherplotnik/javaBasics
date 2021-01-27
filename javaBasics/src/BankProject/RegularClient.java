package BankProject;

public class RegularClient extends Client {

	public RegularClient(int id, String name, float balance) {
		super(id, name, balance);
		this.commissionRate = 0.03F;
		this.interestRate = 0.001F;
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public float getBalance() {
		return super.getBalance();
	}

	@Override
	public void setBalance(float balance) {
		super.setBalance(balance);
	}

	@Override
	public int getId() {
		return super.getId();
	}

	@Override
	public Account[] getAccounts() {
		return super.getAccounts();
	}

	@Override
	public void addAccount(Account account) {
		super.addAccount(account);
	}

	@Override
	public Account getAccount(int id) {
		return super.getAccount(id);
	}

	@Override
	public void removeAccount(int id) {
		super.removeAccount(id);
	}

	@Override
	public void deposite(float amount) {
		super.deposite(amount);
	}

	@Override
	public void withdraw(float amount) {
		super.withdraw(amount);
	}

	@Override
	public void autoUpdate() {
		super.autoUpdate();
	}

	@Override
	public float getFortune() {
		return super.getFortune();
	}

	@Override
	public String getAccountsDetailsAsString() {
		return super.getAccountsDetailsAsString();
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean equals(Object client) {
		return super.equals(client);
	}

}
