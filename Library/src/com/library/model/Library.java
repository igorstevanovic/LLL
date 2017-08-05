package com.library.model;

import java.util.HashMap;

public class Library {
	private String libraryName;
	private HashMap<Integer, Book> books = new HashMap<>();
	private HashMap<Long, Author> authors = new HashMap<>();
	
	public Library() {
		super();
		
	}

	public Library(String libraryName, HashMap<Integer, Book> books, HashMap<Long, Author> authors) {
		super();
		this.libraryName = libraryName;
		this.books = books;
		this.authors = authors;
	}

	public HashMap<Integer, Book> getBooks() {
		return books;
	}

	public void setBooks(HashMap<Integer, Book> books) {
		this.books = books;
	}

	public HashMap<Long, Author> getAuthors() {
		return authors;
	}

	public void setAuthors(HashMap<Long, Author> authors) {
		this.authors = authors;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	@Override
	public String toString() {
		return "Library [libraryName=" + libraryName + ", books=" + books + ", authors=" + authors + "]";
	}
	
	
	
}
