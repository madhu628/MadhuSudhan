package structuralDP;

//Intent: Decouple an abstraction from its implementation so that both can vary independently.
//Example: DriverManager in JDBC separates database drivers from client code
//Abstraction
abstract class Abstraction {
	protected Implementor implementor;

	public Abstraction(Implementor implementor) {
		this.implementor = implementor;
	}

	abstract void operation();
}

//Implementor interface
interface Implementor {
	void operationImpl();
}

//Concrete Implementor
class ConcreteImplementorA implements Implementor {
	public void operationImpl() {
		System.out.println("ConcreteImplementorA operation");
	}
}

//Refined Abstraction
class RefinedAbstraction extends Abstraction {
	public RefinedAbstraction(Implementor implementor) {
		super(implementor);
	}

	@Override
	void operation() {
		implementor.operationImpl();
	}
}

//Client code
public class BridgePattern {
	public static void main(String[] args) {
		Implementor implementor = new ConcreteImplementorA();
		Abstraction abstraction = new RefinedAbstraction(implementor);
		abstraction.operation();
	}
}
