package oops;


//The singleton instance is created when it is first requested.
class LazySingleton1 {
	// Instance is not created until the getInstance method is called
	private static LazySingleton1 instance;

	// Private constructor prevents instantiation from other classes
	private LazySingleton1() {
	}

	// Global access point to get the instance
	public static LazySingleton1 getInstance() {
		if (instance == null) {
			instance = new LazySingleton1();
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Lazy Singleton Instance");
	}
}

public class LazySingleton {
	public static void main(String[] args) {
		LazySingleton1 singleton = LazySingleton1.getInstance();
		singleton.showMessage(); // Output: Lazy Singleton Instance
	}
}