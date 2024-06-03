package oops;

abstract class Shape1 {
	String color;

	// Abstract method (does not have a body)
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

class Circle1 extends Shape1 {
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

class Rectangle extends Shape1 {
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

public class Abstraction1 {
	public static void main(String[] args) {
		Shape1 circle = new Circle1("Red", 5.5);
		Shape1 rectangle = new Rectangle("Blue", 4.0, 3.0);

		System.out.println("Circle color: " + circle.getColor() + ", Area: " + circle.area());
		System.out.println("Rectangle color: " + rectangle.getColor() + ", Area: " + rectangle.area());
	}

}
