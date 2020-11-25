package courseProject;

public class Logger {
	private String DriverName;

	public Logger(String driverName) {
		DriverName = driverName;
	}

	public void log(Log log) {
		System.out.println(log.getData());
	}

	public Log[] getLogs() {
		Log[] logs = null;
		return logs;
	}
	
	public String getDriverName() {
		return DriverName;
	}

}
