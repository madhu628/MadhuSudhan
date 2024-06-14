package oops;

abstract class Animal1 {

	abstract void walk();

	void breathe() {
		System.out.println("This animal breathes air");
	}

	Animal1() {
		System.out.println("You are about to create an Animal.");
	}
}

class Horse extends Animal1 {
	Horse() {
		System.out.println("Wow, you have created a Horse!");
	}

	void walk() {
		System.out.println("Horse walks on 4 legs");
	}
}

class Chicken extends Animal1 {
	Chicken() {
		System.out.println("Wow, you have created a Chicken!");
	}

	void walk() {
		System.out.println("Chicken walks on 2 legs");
	}
}

public class Abstraction {
	public static void main(String args[]) {
		Horse horse = new Horse();
		horse.walk();
		horse.breathe();
	}
}
