package courseProject;

import java.sql.Timestamp;
import java.util.Date;

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

	public void makeLogEntry(String description, int id, float amount) {
		Date date = new Date();
		long time = date.getTime();
		Timestamp ts = new Timestamp(time);
		long longTs = Long.parseLong(ts.toString());
		log(new Log(longTs, id, description, amount));
	}

}
