package behaviouralDP;

import java.util.ArrayList;
import java.util.List;

//Intent: Define a one-to-many dependency between objects so that when one object changes state,

//         all its dependents are notified and updated automatically.
//Example: Event handling systems.

//Subject interface
interface Subject {
	void attach(Observer observer);

	void detach(Observer observer);

	void notifyObservers();
}

//Concrete Subject
class ConcreteSubject implements Subject {
	private List<Observer> observers = new ArrayList<>();
	private String state;

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(state);
		}
	}

	public void setState(String state) {
		this.state = state;
		notifyObservers();
	}
}

//Observer interface
interface Observer {
	void update(String state);
}

//Concrete Observer
class ConcreteObserver implements Observer {
	private String name;

	public ConcreteObserver(String name) {
		this.name = name;
	}

	@Override
	public void update(String state) {
		System.out.println(name + " received state change: " + state);
	}
}

//Client code
public class ObserverPattern {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();

		Observer observer1 = new ConcreteObserver("Observer 1");
		Observer observer2 = new ConcreteObserver("Observer 2");

		subject.attach(observer1);
		subject.attach(observer2);

		subject.setState("New State");
	}
}
