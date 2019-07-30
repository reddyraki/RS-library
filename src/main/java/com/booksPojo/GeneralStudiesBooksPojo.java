package com.booksPojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_table")
public class GeneralStudiesBooksPojo {

	@Id
	
	private String bookName;
	private String page;
	private int cost;
	
	@Override
	public String toString() {
		
		return bookName+" " +page+" "+cost;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
