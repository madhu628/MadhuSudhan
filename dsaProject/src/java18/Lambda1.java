package java18;

@FunctionalInterface
interface Square {
	int calculate(int a);
}

class Madhu implements Square {
	@Override
	public int calculate(int a) {
		return a * a;
	}
}

public class Lambda1 {

//	public static void main(String[] args) {
//
//		Square square = new Square() {
//
//			@Override
//			public int calculate(int a) {
//				return a * a;
//			}
//		};
//		System.out.println(square.calculate(10));
//
//		// Using a lambda expression to implement the functional interface
//		Square square1 = (a) -> a * a;
//
//		System.out.println(square1.calculate(5));
//	}

	public static void main(String[] args) {
		Madhu madhu = new Madhu();
		System.out.println(madhu.calculate(10));
		
		

	}

}
