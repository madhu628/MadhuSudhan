package oops;

//Instance method
//Associated with an instance of the class (object)
//Requires an object to be called
//Can access both instance variables/methods and static variables/methods.

public class Instance {
	// Instance method
	public int multiply(int a, int b) {
		return a * b;
	}
 
	public static void main(String[] args) {
		// Creating an instance of Calculator
		Instance inst = new Instance();
		// Calling instance method using the object
		int product = inst.multiply(5, 3);
		System.out.println("Product: " + product); // Output: Product: 15
	}
}
