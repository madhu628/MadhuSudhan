package oops;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


//Definition: Exceptions that are checked at compile-time.
//Handling: The programmer must handle these exceptions using a try-catch block or 
//    declare them in the method signature using the throws keyword.
//Common Examples: IOException, SQLException




public class CheckedExceptionExample {
	public static void readFile(String fileName) throws IOException {
		// This method declaration indicates that it might throw an IOException
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String line = reader.readLine();
		reader.close();
	}

	public static void main(String[] args) {
		try {
			// Handling the checked exception with a try-catch block
			readFile("nonexistentfile.txt");
		} catch (IOException e) {
			System.out.println("An IOException occurred: " + e.getMessage());
		}
	}
}
