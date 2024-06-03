package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}

public class ComparatorExample {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(3, "Alice"));
		students.add(new Student(1, "Bob"));
		students.add(new Student(2, "Charlie"));

		// Sort students based on name using Comparator
		Collections.sort(students, Comparator.comparing(Student::getName));
		for (Student student : students) {
			System.out.println(student.getId() + ": " + student.getName());
		}
	}
}
