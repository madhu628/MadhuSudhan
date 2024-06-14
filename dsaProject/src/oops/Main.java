package oops;

public class Main {
	public static void main(String[] args) {
		Address address = new Address("New York", "5th Avenue");
		ImmutablePerson person = new ImmutablePerson("John Doe", 30, address);

		System.out.println(person);

		// The following will not change the person's address
		address.getCity();
		address.setCity("Los Angeles");

		System.out.println(person); // Address remains "New York"

		// Attempt to modify through the getter's result also has no effect
		person.getAddress().setCity("San Francisco");

		System.out.println(person); // Address remains "New York"
	}
}
