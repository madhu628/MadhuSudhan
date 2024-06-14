package oops;

//Step 1: Declare the class as final so it cannot be subclassed/inherited

final class ImmutablePerson {

	// Step 2: Make all fields private and final to ensure that their values cannot be modified after the object is constructed.
	private final String name;
	private final int age;
	private final Address address; // Assume Address is a mutable class

	// Step 3: Provide a constructor to set all fields
	public ImmutablePerson(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = new Address(address); // Create a defensive copy
	}

	// Step 4: Provide only getters, no setters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// Defensive copy of a mutable field
	public Address getAddress() {
		return new Address(address);
	}

	// Override toString for a readable representation
	@Override
	public String toString() {
		return "ImmutablePerson{" + "name='" + name + '\'' + ", age=" + age + ", address=" + address + '}';
	}

	// Override equals and hashCode for correct behavior in collections
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		ImmutablePerson that = (ImmutablePerson) o;

		if (age != that.age)
			return false;
		if (!name.equals(that.name))
			return false;
		return address.equals(that.address);
	}

	@Override
	public int hashCode() {
		int result = name.hashCode();
		result = 31 * result + age;
		result = 31 * result + address.hashCode();
		return result;
	}
}

//Assume Address is a mutable class
class Address {
	private String city;
	private String street;

	public Address(String city, String street) {
		this.city = city;
		this.street = street;
	}

	public Address(Address address) {
		this.city = address.city;
		this.street = address.street;
	}

	// Getters and setters
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address{" + "city='" + city + '\'' + ", street='" + street + '\'' + '}';
	}
	
	public static void main(String[] args) {
		Address address = new Address("New York", "5th Avenue");
		ImmutablePerson person = new ImmutablePerson("John Doe", 30, address);

		System.out.println(person);

		// The following will not change the person's address
		address.setCity("Los Angeles");

		System.out.println(person); // Address remains "New York"

		// Attempt to modify through the getter's result also has no effect
		person.getAddress().setCity("San Francisco");

		System.out.println(person); // Address remains "New York"
	}
}
