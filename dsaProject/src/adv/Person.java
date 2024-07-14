package adv;

import java.io.Serializable;

public class Person implements Serializable {
	private String name;
	private int age;

	// No-argument constructor
	public Person() {
	}

	// Getter for name property
	public String getName() {
		return name;
	}

	// Setter for name property
	public void setName(String name) {
		this.name = name;
	}

	// Getter for age property
	public int getAge() {
		return age;
	}

	// Setter for age property
	public void setAge(int age) {
		this.age = age;
	}

	// Method to display person's information
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
