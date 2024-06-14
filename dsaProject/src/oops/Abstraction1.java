package oops;

//An abstract class must be declared with an abstract keyword
abstract class Shape1 {
	

	// It can have abstract and non-abstract methods

	// It can have constructors and static methods also.
	// It can have final methods which will force the subclass not to change the
	// body of the method
	// Abstract method (does not have a body)
	String color;
	abstract double area();

	// Non-abstract method
	public String getColor() {
		return color;
	}

	// Constructor
	public Shape1(String color) {
		this.color = color;
	}
}

//Subclass
class Circle1 extends Shape1 {
	// Provide implementation for abstract method
	double radius;

	public Circle1(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * radius * radius;
	}
}

//Subclass
class Rectangle extends Shape1 {
	// Provide implementation for abstract method
	double length, width;

	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		return length * width;
	}
}

//Main class to test abstraction
public class Abstraction1 {
	public static void main(String[] args) {
		Shape1 circle = new Circle1("Red", 5.5);
		Shape1 rectangle = new Rectangle("Blue", 4.0, 3.0);

		System.out.println("Circle color: " + circle.getColor() + ", Area: " + circle.area());
		System.out.println("Rectangle color: " + rectangle.getColor() + ", Area: " + rectangle.area());
	}

}
