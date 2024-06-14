package oops;

import java.util.Date;

//Declare the class as final so it cannot be subclassed/inherited
public final class ImmutableClass {
	
	// Make all fields private and final to ensure that their values cannot be modified after the object is constructed
	private final String name;
	private final int age;
	private final Date dateOfBirth;

	// Constructor to initialize all fields
	public ImmutableClass(String name, int age, Date dateOfBirth) {
		this.name = name;
		this.age = age;
		// Make a defensive copy of the mutable object
		this.dateOfBirth = new Date(dateOfBirth.getTime());
	}
	
	//Do not provide setters for any fields
	// Getter for name
	public String getName() {
		return name;
	}

	// Getter for age
	public int getAge() {
		return age;
	}

	// Getter for dateOfBirth (returns a defensive copy)
	//For mutable objects, provide a defensive copy in the constructor and getters.
	public Date getDateOfBirth() {
		return new Date(dateOfBirth.getTime());
	}

	@Override
	public String toString() {
		return "ImmutableClass{" + "name='" + name + '\'' + ", age=" + age + ", dateOfBirth=" + dateOfBirth + '}';
	}

	public static void main(String[] args) {
		Date dob = new Date();
		ImmutableClass obj = new ImmutableClass("John", 30, dob);

		// Print the object
		System.out.println(obj);

		// Try to modify the Date object
		dob.setTime(dob.getTime() - 1000000000L);

		// Print the object again to see if dateOfBirth has changed
		System.out.println(obj);
	}
}
