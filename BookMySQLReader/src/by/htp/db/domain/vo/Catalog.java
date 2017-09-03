package by.htp.db.domain.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import by.htp.db.domain.entity.Book;

public class Catalog implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6641593604381645435L;
	private String title;
	private Date dateCreation;
	private List<Book> books;
	
	public Catalog() {
		super();
	}
	
	public Catalog(String title, Date dateCreation, List<Book> books) {
		super();
		this.title = title;
		this.dateCreation = dateCreation;
		this.books = books;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Catalog [title=" + title + ", dateCreation=" + dateCreation + ", books=" + books + "]";
	}
	

}
