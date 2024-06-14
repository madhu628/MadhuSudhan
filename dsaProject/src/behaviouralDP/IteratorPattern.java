package behaviouralDP;

//Intent: Provide a way to access elements of a collection sequentially without exposing its underlying representation.
//Example: java.util.Iterator

//Aggregate interface
interface Aggregate {
	Iterator createIterator();
}

//Concrete Aggregate
class ConcreteAggregate implements Aggregate {
	private String[] items = { "item1", "item2", "item3" };

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	public String getItem(int index) {
		return items[index];
	}

	public int size() {
		return items.length;
	}
}

//Iterator interface
interface Iterator {
	boolean hasNext();

	Object next();
}

//Concrete Iterator
class ConcreteIterator implements Iterator {
	private ConcreteAggregate aggregate;
	private int index = 0;

	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public boolean hasNext() {
		return index < aggregate.size();
	}

	@Override
	public Object next() {
		return aggregate.getItem(index++);
	}
}

//Client code
public class IteratorPattern {
	public static void main(String[] args) {
		Aggregate aggregate = new ConcreteAggregate();
		Iterator iterator = aggregate.createIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
