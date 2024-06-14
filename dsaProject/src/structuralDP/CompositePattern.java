package structuralDP;

import java.util.ArrayList;
import java.util.List;

//Intent: Compose objects into tree structures to represent part-whole hierarchies.
//Example: java.awt.Container uses composite pattern to create GUI components hierarchy

//Component
interface Component {
	void operation();
}

//Leaf
class Leaf implements Component {
	@Override
	public void operation() {
		System.out.println("Leaf operation");
	}
}

//Composite
class Composite implements Component {
	private List<Component> children = new ArrayList<>();

	public void add(Component component) {
		children.add(component);
	}

	public void remove(Component component) {
		children.remove(component);
	}

	@Override
	public void operation() {
		for (Component component : children) {
			component.operation();
		}
	}
}

//Client code
public class CompositePattern {
	public static void main(String[] args) {
		Leaf leaf1 = new Leaf();
		Leaf leaf2 = new Leaf();

		Composite composite = new Composite();
		composite.add(leaf1);
		composite.add(leaf2);

		composite.operation();
	}
}
