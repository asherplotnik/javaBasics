package jdbcDao;

public interface BookDao {
	
	/**
	 * 
	 * save a book to storage
	 * 
	 * @param book
	 * @throws DaoException
	 */
	void save(Book book) throws DaoException ;
	
	/**
	 * 
	 * get a book from storage
	 * 
	 * @param id
	 * @return
	 * @throws DaoException
	 */
	
	Book get(int id) throws DaoException;
	
	
	/**
	 * 
	 *  update a book to storage
	 * 
	 * @param book
	 * @throws DaoException
	 */
	void update(Book book) throws DaoException;
	
	/**
	 * 
	 *  delete a book to storage
	 * 
	 * @param id
	 * @throws DaoException
	 */
	void delete(int id) throws DaoException;
}
