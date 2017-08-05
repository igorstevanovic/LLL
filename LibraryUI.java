package com.library;

import com.library.model.Library;

public class LibraryUI {

	public static Library library;
	
	public static void mainMenu() {
		
		System.out.println("*****************");
		System.out.println("*** Main Menu ***");
		System.out.println("*****************");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		library = new Library();
		
		LibraryUI.mainMenu();
		

	}

}
