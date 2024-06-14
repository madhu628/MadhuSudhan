package oops;

interface Shape2 {
	// All the fields in interfaces are public, static and final by default
	//All methods are public & abstract by default.
	//Interfaces support the functionality of multiple inheritance
	double area();

	String getColor();
}

class Circle2 implements Shape2 {
	//A class that implements an interface must implement all the methods declared in the interface
	private String color;
	private double radius;

	public Circle2(String color, double radius) {
		this.color = color;
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public String getColor() {
		return color;
	}
}

class Rectangle1 implements Shape2 {
	private String color;
	private double length, width;

	public Rectangle1(String color, double length, double width) {
		this.color = color;
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		return length * width;
	}

	@Override
	public String getColor() {
		return color;
	}
}

//Main class to test abstraction
public class AbstractionUsingInterface1 {
	public static void main(String[] args) {
		Shape2 circle = new Circle2("Red", 5.5);
		Shape2 rectangle = new Rectangle1("Blue", 4.0, 3.0);

		System.out.println("Circle color: " + circle.getColor() + ", Area: " + circle.area());
		System.out.println("Rectangle color: " + rectangle.getColor() + ", Area: " + rectangle.area());
	}

}
