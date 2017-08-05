package com.library.model;

public class Book {
	private Long id;
	private String title;
	private Author author;
	
	public Book() {
		super();
		
			
	}

	public Book(Long id, String title, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
	
	
	
	
}
