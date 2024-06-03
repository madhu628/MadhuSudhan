package java18;

@FunctionalInterface
interface Drawable1 {
	void draw(int width);
}

class Madhu1 implements Drawable1 {

	@Override
	public void draw(int width) {

		System.out.println(width);

	}

}

public class Lambda {
//	public static void main(String[] args) {
//		// Using an anonymous class to implement the functional interface
//
//		Drawable1 d = new Drawable1() {
//
//			@Override
//			public void draw(int width) {
//				System.out.println(width);
//
//			}
//		};
//		d.draw(5); // Output: 5
//
//		// Using a lambda expression to implement the functional interface
//		Drawable1 d2 = (width) -> System.out.println(width);
//		d2.draw(10); // Output: 10
//	}

	public static void main(String[] args) {

		Madhu1 madhu = new Madhu1();

		madhu.draw(5);

		// Lambda
		Drawable1 drawable1 = (width) -> System.out.println(width);
		drawable1.draw(5);
	}

}
