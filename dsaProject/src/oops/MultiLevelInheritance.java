package oops;

//Superclass
class Shape5 {
	public void area() {
		System.out.println("Displays Area of Shape");
	}
}

//Intermediate subclass
class Triangle5 extends Shape5 {
	public void area(int h, int b) {
		System.out.println(0.5 * b * h);
	}
}

//Subclass
class EquilateralTriangle extends Triangle5 {
	int side;

	public EquilateralTriangle(int side) {
		this.side = side;
	}

	public void area() {
		// For an equilateral triangle, the area can be calculated as (sqrt(3)/4) *
		// side^2
		double area = (Math.sqrt(3) / 4) * (side * side);
		System.out.println("Area of Equilateral Triangle: " + area);
	}
}
//Main class to test multilevel inheritance
public class MultiLevelInheritance {
	public static void main(String[] args) {
		Shape5 shape = new Shape5();
		shape.area(); // Output: Displays Area of Shape

		Triangle5 triangle = new Triangle5();
		triangle.area(); // Output: Displays Area of Shape (inherited method)
		triangle.area(10, 5); // Output: 25.0

		EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5);
		equilateralTriangle.area(); // Output: Area of Equilateral Triangle: 10.825317547305485

	}
}
