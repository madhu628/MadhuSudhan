package oops;

class Shape4 {
	public void area() {
		System.out.println("Displays Area of Shape");
	}
}

class Triangle4 extends Shape4 {
	public void area(int h, int b) {
		System.out.println(0.5 * b * h);
	}
}

class Circle4 extends Shape4 {
	public void area(int r) {
		System.out.println((3.14) * r * r);
	}
}

public class HierarachicalInheritance {

	public static void main(String[] args) {

		Shape4 shape = new Shape4();
		shape.area(); // Output: Displays Area of Shape

		Triangle4 triangle = new Triangle4();
		triangle.area(); // Output: Displays Area of Shape (inherited method)
		triangle.area(10, 5); // Output: 25.0

		Circle4 circle = new Circle4();
		circle.area(); // Output: Displays Area of Shape (inherited method)
		circle.area(7); // Output: 153.86
	}

}
