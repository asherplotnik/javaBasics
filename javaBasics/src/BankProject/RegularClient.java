package BankProject;

public class RegularClient extends Client {

	public RegularClient(int id, String name, float balance) {
		super(id, name, balance);
		this.commissionRate = 0.03F;
		this.interestRate = 0.001F;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public float getBalance() {
		// TODO Auto-generated method stub
		return super.getBalance();
	}

	@Override
	public void setBalance(float balance) {
		// TODO Auto-generated method stub
		super.setBalance(balance);
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public Account[] getAccounts() {
		// TODO Auto-generated method stub
		return super.getAccounts();
	}

	@Override
	public void addAccount(Account account) {
		// TODO Auto-generated method stub
		super.addAccount(account);
	}

	@Override
	public Account getAccount(int id) {
		// TODO Auto-generated method stub
		return super.getAccount(id);
	}

	@Override
	public void removeAccount(int id) {
		// TODO Auto-generated method stub
		super.removeAccount(id);
	}

	@Override
	public void deposite(float amount) {
		// TODO Auto-generated method stub
		super.deposite(amount);
	}

	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		super.withdraw(amount);
	}

	@Override
	public void autoUpdate() {
		// TODO Auto-generated method stub
		super.autoUpdate();
	}

	@Override
	public float getFortune() {
		// TODO Auto-generated method stub
		return super.getFortune();
	}

	@Override
	public String getAccountsDetailsAsString() {
		// TODO Auto-generated method stub
		return super.getAccountsDetailsAsString();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public boolean equals(Object client) {
		// TODO Auto-generated method stub
		return super.equals(client);
	}

}
