package jdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import java.sql.PreparedStatement;

public class PreparedStatementDemo {
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/db1?createDatabaseIfNotExist=true";
		String username = "root";
		String password = "h7r2haba";
		try (Connection con = DriverManager.getConnection(url,username,password);) {
			System.out.println("connected to: " +url);
			String sql  = "select * from book where id = ? and title = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			int id  = Integer.parseInt(JOptionPane.showInputDialog("Enter id: "));
			String title  = JOptionPane.showInputDialog("Enter title: ");
			pstmt.setDouble(1,id);
			pstmt.setString(2,title);
			ResultSet rs = pstmt.executeQuery();
			
			rs.next();
			System.out.println(rs.getString("title"));
		} catch (SQLException e) {
			System.out.println("Failed toCconnect: " + url);
			e.printStackTrace();
		}
	}
}
