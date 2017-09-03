package by.htp.db.domain.entity;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable{
	
	private static final long serialVersionUID = -3275800602077561280L;
	private int id;
	private String title;
	private int pages;
	private Date date;
	
	public Book() {
		super();
	}
	
	public Book(int id, String title, int pages) {
		super();
		this.id = id;
		this.title = title;
		this.pages = pages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", pages=" + pages + "]";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
