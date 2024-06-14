package structuralDP;


//Intent: Convert the interface of a class into another interface clients expect.
//Example: java.util.Arrays.asList() adapts an array to List interface.


//Adaptee
class Adaptee {
	public void specificRequest() {
		System.out.println("Adaptee's specificRequest called");
	}
}

//Target interface
interface Target {
	void request();
}

//Adapter
class Adapter implements Target {
	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		adaptee.specificRequest();
	}
}

//Client code
public class AdapterPattern1 {
	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Target adapter = new Adapter(adaptee);
		adapter.request();
	}
}
