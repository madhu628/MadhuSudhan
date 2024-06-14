package oops;

//static method example
//Associated with the class itself.
//Can be called without an object
//Cannot access instance variables/methods directly.



//Feature	  					Static Method				Instance Method
//Belongs to						Class						Object
//Call using				ClassName.methodName()			object.methodName()
//Access instance members			No								Yes
//Access static members				Yes								Yes
//Requires object					No								Yes

public class MathUtils {
	// Static method
	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// Calling static method using the class name
		int sum = MathUtils.add(5, 3);
		System.out.println("Sum: " + sum); // Output: Sum: 8
	}
}
