package oops;

//The singleton instance is created at the time of class loading.

class EagerSingleton1 {
	// Instance is created at the time of class loading
	private static final EagerSingleton1 instance = new EagerSingleton1();

	// Private constructor prevents instantiation from other classes
	private EagerSingleton1() {
	}

	// Global access point to get the instance
	public static EagerSingleton1 getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Eager Singleton Instance");
	}
}

public class EagerSingleton {
	public static void main(String[] args) {
		EagerSingleton1 singleton = EagerSingleton1.getInstance();
		singleton.showMessage(); // Output: Eager Singleton Instance
	}
}
