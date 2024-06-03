package collections;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
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

	@Override
	public int compareTo(Student other) {
		return Integer.compare(this.id, other.id);
	}
}

public class ComparableExample {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(3, "Alice"));
		students.add(new Student(1, "Bob"));
		students.add(new Student(2, "Charlie"));

		Collections.sort(students); // Sort students based on id
		for (Student student : students) {
			System.out.println(student.getId() + ": " + student.getName());
		}
	}
}
