package jdbcDao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookDaoDb implements BookDao{
	
	//database details
	private String url = "jdbc:mysql://localhost:3306/db1?createDatabaseIfNotExist=true";
	private String username = "root";
	private String password = "h7r2haba";

	public void save(Book book) throws DaoException {
		try (Connection con = DriverManager.getConnection(url,username,password);){
			String sql = "insert into book values(?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,book.getId());
			pstmt.setString(2,book.getTitle());
			pstmt.setString(3,book.getAuthor());
			pstmt.setDouble(4,book.getPrice());
			pstmt.setDate(5, Date.valueOf(book.getPublication()));
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException("Saving book: " + book + " faild.", e );
		}
		
	}
	
	
	@Override
	public Book get(int id) throws DaoException {
		try (Connection con = DriverManager.getConnection(url,username,password);){
			String sql = "select * from book where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				Book book = new Book(id);
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getDouble("price"));
				LocalDate localDate = rs.getDate("publication").toLocalDate();
				book.setPublication(localDate);
				return book;
			} else {
				return null;				
			}
			
		} catch (SQLException e) {
			throw new DaoException("getting book with id: " + id + " faild.", e );
		}
		
	}



	@Override
	public void update(Book book) throws DaoException {
		try (Connection con = DriverManager.getConnection(url,username,password);){
			String sql = "update book set title = ? , author = ?, price = ? , publication = ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1,book.getTitle());
			pstmt.setString(2,book.getAuthor());
			pstmt.setDouble(3,book.getPrice());
			pstmt.setDate(4, Date.valueOf(book.getPublication()));
			pstmt.setInt(5,book.getId());
			int rowCount = pstmt.executeUpdate();
			if(rowCount == 0) {
				throw new DaoException("Updating book: " + book + " faild. id not found");	
			}
		} catch (SQLException e) {
			throw new DaoException("Updating book: " + book + " faild.", e );
		}
		
	}



	@Override
	public void delete(int id) throws DaoException {
		try (Connection con = DriverManager.getConnection(url,username,password);){	
			String sql = "delete from book where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,id);			
			int rowCount = pstmt.executeUpdate();
			if(rowCount == 0) {
				throw new DaoException("Deleting book id :" + id + " faild. id not found");					
			}	
		} catch (SQLException e) {
			throw new DaoException("Deleting book with id: " + id + " faild.", e );
		}
		
	}
	
	public List<Book> getAllBooks() throws DaoException{
		List<Book> list = new ArrayList<>();
		try (Connection con = DriverManager.getConnection(url,username,password);){
			String sql = "select * from book";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Book book = new Book(rs.getInt("id"));
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getDouble("price"));
				LocalDate localDate = rs.getDate("publication").toLocalDate();
				book.setPublication(localDate);
				list.add(book);
			}
			return list;
		} catch (SQLException e) {
			throw new DaoException("getting book list faild.", e );
		}
		
	}
	
	
	public static void main(String[] args) {
		//Book book = new Book(4,"nui", "cute", 200, LocalDate.of(2015,01,05));
		Book book2 = new Book(5,"nui", "good", 300, LocalDate.of(1980,8,10));
		BookDaoDb dao = new BookDaoDb();
		try {
			//dao.save(book);
			//System.out.println(dao.get(4));
			dao.update(book2);
			System.out.println(dao.get(4));
			System.out.println(dao.getAllBooks());
		} catch (DaoException e) {
			System.out.println(e);
			System.out.println(e.getCause());
			//e.printStackTrace();
		}
	}
}
