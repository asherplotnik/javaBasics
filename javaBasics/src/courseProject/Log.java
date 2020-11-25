package courseProject;

public class Log {

	private long ts;
	private int clientId;
	private String description;
	private float amount;

	public Log(long timestamp, int clientId, String description, float amount) {
		this.ts = timestamp;
		this.clientId = clientId;
		this.description = description;
		this.amount = amount;
	}

	public Log(int clientId, String description, float amount) {
		this(System.currentTimeMillis(), clientId, description, amount);
	}

	public String getData() {
		return "Log [ts= " + ts + " CLient ID: " + clientId + " Description: " + description + " Amount: " + amount + " ]";
	}
}
