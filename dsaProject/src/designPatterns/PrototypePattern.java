package designPatterns;

//Prototype class implementing Cloneable interface
class Prototype implements Cloneable {
	// Example fields (optional, for demonstration)
	private String name;
	private int value;

	// Constructor (optional, for demonstration)
	public Prototype(String name, int value) {
		this.name = name;
		this.value = value;
	}

	// Getters and Setters (optional, for demonstration)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	// Override the clone method from the Cloneable interface
	@Override
	public Prototype clone() {
		try {
			return (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			// Handle the exception (unlikely to happen as we implement Cloneable)
			e.printStackTrace();
			return null;
		}
	}

	// ToString method (optional, for demonstration)
	@Override
	public String toString() {
		return "Prototype{name='" + name + "', value=" + value + "}";
	}
}

//Main class to test the Prototype cloning
public class PrototypePattern {
	public static void main(String[] args) {
		// Create an instance of Prototype
		Prototype original = new Prototype("Original", 42);

		// Clone the original instance
		Prototype cloned = original.clone();

		// Modify the clone (optional, for demonstration)
		cloned.setName("Cloned");
		cloned.setValue(84);

		// Print the details of original and cloned instances
		System.out.println("Original: " + original);
		System.out.println("Cloned: " + cloned);
	}
}
