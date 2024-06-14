package designPatterns;

//Interface for Shape
interface Shape {
	void draw();
}

//Implementation of Shape for Circle
class Circle implements Shape {
	public void draw() {
		System.out.println("Drawing Circle.");
	}
}

//Factory to create shapes
class ShapeFactory1 {
	public static Shape getShape(String type) {
		if ("Circle".equalsIgnoreCase(type)) {
			return new Circle();
		}
		// Add more shapes here if needed
		return null;
	}
}

//Main class to test the ShapeFactory
public class ShapeFactory {
	public static void main(String[] args) {
		// Create a Circle using the ShapeFactory
		Shape shape = ShapeFactory1.getShape("Circle");

		// Check if shape is not null and call draw
		if (shape != null) {
			shape.draw();
		} else {
			System.out.println("Shape type not recognized.");
		}
	}
}
