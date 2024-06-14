package oops;

//Interface 1
interface CanFly {
	void fly();
}

//Interface 2
interface CanSwim {
	void swim();
}

//Class implementing both interfaces
class Duck implements CanFly, CanSwim {
	public void fly() {
		System.out.println("Flying...");
	}

	public void swim() {
		System.out.println("Swimming...");
	}
}

//Main class to test multiple inheritance using interfaces
public class MultipleInheritancewithInterfaces {

	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.fly(); // From CanFly
		duck.swim(); // From CanSwim
	}

}
