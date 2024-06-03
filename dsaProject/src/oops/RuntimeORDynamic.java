package oops;

class Shape {
	public void area() {
		System.out.println("Displays Area of Shape");
	}
}

class Triangle extends Shape {
	@Override
	public void area() {
		System.out.println("Area of Triangle");
	}

	public void area(int h, int b) {
		System.out.println(0.5 * b * h);
	}
}

class Circle extends Shape {
	@Override
	public void area() {
		System.out.println("Area of Circle");
	}

	public void area(int r) {
		System.out.println((3.14) * r * r);
	}
}

public class RuntimeORDynamic {

	public static void main(String[] args) {
		Shape shape = new Circle();

		shape.area();

		Shape shape2 = new Triangle();
		shape2.area();

		Circle myCircle = new Circle();
		myCircle.area(7);

		Triangle myTriangle = new Triangle();
		myTriangle.area(10, 5);
	}

}
