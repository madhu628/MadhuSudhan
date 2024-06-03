package oops;

interface Animal2 {
	void walk();
}

class Horse1 implements Animal2 {
	public void walk() {
		System.out.println("Horse walks on 4 legs");
	}
}

class Chicken1 implements Animal2 {
	public void walk() {
		System.out.println("Chicken walks on 2 legs");
	}
}

public class AbstractionUsingInterface {
	public static void main(String args[]) {
		Horse1 horse = new Horse1();
		horse.walk();
	}

}
