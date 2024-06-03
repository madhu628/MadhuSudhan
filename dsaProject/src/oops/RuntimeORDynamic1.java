package oops;

//Superclass
class Animal {
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

//Subclass 1
class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}

//Subclass 2
class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("Cat meows");
	}
}

public class RuntimeORDynamic1 {
	public static void main(String[] args) {
		// Reference variable of type Animal, but it refers to an instance of Dog
		Animal myAnimal = new Dog();
		myAnimal.sound(); // Output: Dog barks

		// Reference variable of type Animal, but it refers to an instance of Cat
		myAnimal = new Cat();
		myAnimal.sound(); // Output: Cat meows
	}
}
