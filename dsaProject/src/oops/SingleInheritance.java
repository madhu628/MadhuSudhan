package oops;


//Superclass
class Shape3 {
	public void area() {
		System.out.println("Displays Area of Shape");
	}
}


//Subclass
class Triangle1 extends Shape3 {
	public void area(int h, int b) {
		System.out.println(0.5 * b * h);
	}
}

//Main class to test single inheritance
public class SingleInheritance {
	public static void main(String[] args) {
		Shape3 shape = new Shape3();

		shape.area();

		Triangle1 myTriangle = new Triangle1();
		myTriangle.area(10, 5);
	}
}
