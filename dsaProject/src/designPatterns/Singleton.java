package designPatterns;

//Singleton Pattern
//Ensures a class has only one instance and provides a global point of access to it.
public class Singleton {
	private static Singleton instance;

	// Private constructor prevents instantiation from other classes
	private Singleton() {
	}

	// Returns the single instance of the Singleton class
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	// Example method to demonstrate functionality
	public void showMessage() {
		System.out.println("Hello from Singleton!");
	}

	public static void main(String[] args) {
		// Get the only object available
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		// Display message from singleton instance
		singleton1.showMessage();

		// Check if both references point to the same instance
		System.out.println("singleton1 and singleton2 are the same instance: " + (singleton1 == singleton2));
	}
}
