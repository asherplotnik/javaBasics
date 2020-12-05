package BankProject;

import java.util.Arrays;

public class Bank {
	private static Bank instance = new Bank(); 
	private Client[] clients;
	private Logger logService;
	private static float commissionSum;
	// account updater
	private Bank() {
		this.clients = new Client[100];
		this.logService = new Logger("Log Service");
	}
	
	public Bank getInstance() {
		return instance;
	}
	
	public Client[] getClients() {
		return clients;
	}

	public float getBalance() {
		float sum = 0;
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] != null) {
				sum += clients[i].getFortune();
			}
		}
		return sum + Bank.commissionSum;
	}

	public void addClient(Client client) {
		int i;
		for (i = 0; i < clients.length; i++) {
			if (clients[i] == null) {
				clients[i] = client;
				logService.log(new Log(client.getId(), "Client added- " , 0.0F));
				return;
			}
		}
		if (i == 100) {
			System.out.println("There is no more space for more clients!");
		}
		;
	}

	public void removeClient(Client client) {
		
		if(Arrays.asList(clients).contains(client)) {
			logService.log(new Log(client.getId(), "Client removed- " , 0.0F));
			client = null;
		} else {
			System.out.println("error - client dont exists!");
		}
	}
	
	public static void addCommission(float num) {
		commissionSum+=num;
	}
	
	public void printClientList() {
		for ( Client client : clients) {
			System.out.println(client);
		}
	}

	public void viewLogs() {
		// leave empty
	}

	public void startAccountUpdater() {
		// leave empty
	}

}
