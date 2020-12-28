package jdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;


public class Connect {
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/db1?createDatabaseIfNotExist=true";
		String username = "root";
		String password = "h7r2haba";
		try (Connection con = DriverManager.getConnection(url,username,password);) {
			System.out.println("connected to: " +url);
			Statement stmt = con.createStatement();
			String sql1  = "select * from book";
			String sql  = "insert into book values(5,'book5','ash')";
			stmt.executeUpdate(sql);
			ResultSet rs = stmt.executeQuery(sql1);
			System.out.println("ID" + "\t" +"TITLE" + "\t   " +"AUTHOR");
			System.out.println("=========================");
			while (rs.next()) {
				int id = rs.getInt("ID");
		        String title = rs.getString("TITLE");
		        String author = rs.getString("AUTHOR");		        
		        System.out.println(id + "\t" + title + "\t   " + author );
		   }
			
			
			
		} catch (SQLException e) {
			System.out.println("Failed toCconnect: " + url);
			e.printStackTrace();
		}
		
		System.out.println("not connected to : " + url);
		
	}

}
