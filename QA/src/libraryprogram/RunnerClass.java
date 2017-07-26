package libraryprogram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class RunnerClass {

	static String fileName = null;
	static Library lib = new Library();
	static Scanner in = new Scanner(System.in);
	static Boolean running = true;

	public static void main(String[] args) {
		while (running) {
			System.out.println("\nEnter 0 to load a library" + "\nEnter 1 to save and quit"
					+ "\nEnter 2 to list all books in library" + "\nEnter 3 to add book to library");

			int answer = in.nextInt();
			switch (answer) {
			case 0:
				System.out.println("Enter the file name to load");
				fileName = in.next();
				loadScript(fileName);
				break;

			case 1:
				saveAndQuit();
				break;
			case 2:
				System.out.println(lib.toString());
				break;
			case 3:
				addBook();
				break;
			}
		}
		System.exit(0);

	}

	private static void addBook() {
		int productNumber;
		String title, author;

		System.out.println("\nEnter title: ");
		title = in.next();

		System.out.println("\nEnter Author: ");
		author = in.next();

		System.out.println("\nEnter Product Number: ");
		productNumber = in.nextInt();

		Book b = new Book(productNumber, title, author);
		lib.addBook(b);
	}

	private static void saveAndQuit() {
		System.out.println("Enter file name: ");
		fileName = in.next();
		running = false;

		FileOutputStream fos = null;
		ObjectOutputStream out = null;

		try {
			fos = new FileOutputStream(fileName);
			out = new ObjectOutputStream(fos);
			out.writeObject(lib);
			fos.close();
			out.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void loadScript(String name) {

		FileInputStream fis = null;
		ObjectInputStream in = null;

		File file = new File(name + ".ser");
		if (file.exists()) {
			try {
				fis = new FileInputStream(file);
				in = new ObjectInputStream(fis);
				lib = (Library) in.readObject();
				fis.close();
				in.close();

			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("\nThe file does not exist");
		}
	}
}