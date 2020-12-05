package BankProject;

public class TestBank {

	public static void main(String[] args) {
		Client cl = new Client(111, "Aaa", 25_000);
		Account account = new Account(6589,50_000);
				cl.addAccount(account);
	}

}
