package courseProject;

public class Bank {
	Client[] clients;
	Logger logService, logger;

	// account updater
	public Bank() {
		this.clients = new Client[100];
		this.logService = new Logger("Log Service");
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
		return sum;
	}

	public void addClient(Client client) {
		int i;
		for (i = 0; i < clients.length; i++) {
			if (clients[i] == null) {
				clients[i] = client;
				logService.makeLogEntry("Client added- ", client.getId(), 0.0F);
				return;
			}
		}
		if (i == 100) {
			System.out.println("There is no more space for more clients!");
		}
		;
	}

	public void removeClient(int id) {
		logService.makeLogEntry("Client removed- ", clients[id].getId(), 0.0F);
		clients[id] = null;
	}

	public void viewLogs() {
		// leave empty
	}

	public void startAccountUpdater() {
		// leave empty
	}

}
