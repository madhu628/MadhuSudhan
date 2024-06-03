package oops;

//Example of Compile-Time Polymorphism (Method Overloading) 
//same method with different parameters

class Student {
	String name;
	int age;

	public void displayInfo(String name) {
		System.out.println(name);
	}

	public void displayInfo(int age) {
		System.out.println(age);
	}

	public void displayInfo(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}
}

public class CompileTimeORStatic {
	
	public static void main(String[] args) {
		Student student = new Student();
		
		student.displayInfo("madhu");
		student.displayInfo(25);
		
		student.displayInfo("Alice", 20);
		
	}

}
