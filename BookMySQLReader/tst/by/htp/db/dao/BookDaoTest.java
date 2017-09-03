package by.htp.db.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import by.htp.db.dao.impl.BookMySqlDAO;
import by.htp.db.domain.entity.Book;

public class BookDaoTest {

	private static BookDao dao;
	
	@BeforeClass
	public static void initDao() {
		dao = new BookMySqlDAO();
	}
	
	@Test
	public void testNullList() {
		List<Book> books = dao.fetchBooks();
		assertNotNull("The returned list is null", books);
	}
	
	@Test
	public void testEmptyList() {
		List<Book> books = dao.fetchBooks();
		assertTrue("The returned list contains zero books", books.size()>0);
	}
	
	@Test
	public void testNullBook() {
		Book book = dao.fetchBook();
		assertNotNull("The returned list is null", book);
	}
	
	@Test
	public void testEmptyTitleBook() {
		Book book = dao.fetchBook();
		assertFalse("The returned book not contains title", book.getTitle().isEmpty());
	}


	

}
