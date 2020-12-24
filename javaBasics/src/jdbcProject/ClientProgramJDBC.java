package jdbcProject;

import java.sql.DriverManager;
import java.sql.Driver;
import java.util.Enumeration;


public class ClientProgramJDBC {
	public static void main(String[] args) {
		
		// how to load drivers if needed
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		Enumeration<Driver> enumerator = DriverManager.getDrivers();
		while( enumerator.hasMoreElements()) {
			System.out.println(enumerator.nextElement());
		}
		
		
	}

}
