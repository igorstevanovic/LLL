package com.library;

import java.util.Scanner;

import com.library.model.Library;

public class LibraryUI {

	public static Library library;
	public static Scanner sc;

	public static void mainMenu() {

		System.out.println("*****************");
		System.out.println("*** Main Menu ***");
		System.out.println("*****************");
		System.out.println("1 - Authors");
		System.out.println("2 - Books");
		System.out.println("x - Exit");
		System.out.println();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		library = new Library();
		sc = new Scanner(System.in);
		String menuOption;

		do {
			LibraryUI.mainMenu();
			System.out.println("Your choice >>>");
			menuOption = sc.nextLine();

			switch (menuOption) {
			case "1":

				break;
			case "2":

				break;
			case "x":
				System.out.println("--- THE END ---");
				break;
			default:
				break;
			}

		} while (!menuOption.equals("x"));

	}

}
