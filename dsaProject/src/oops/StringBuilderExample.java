package oops;

public class StringBuilderExample {
	public static void main(String[] args) {
		// Creating a StringBuilder object
		StringBuilder sb = new StringBuilder("Hello");

		// Appending strings
		sb.append(" World");
		System.out.println("After append: " + sb);

		// Inserting a string at a specified position
		sb.insert(5, " Java");
		System.out.println("After insert: " + sb);

		// Reversing the string
		sb.reverse();
		System.out.println("After reverse: " + sb);

		// Replacing a part of the string
		sb.reverse(); // Reversing back to original for replacement
		sb.replace(5, 10, "Beautiful");
		System.out.println("After replace: " + sb);
	}
}
