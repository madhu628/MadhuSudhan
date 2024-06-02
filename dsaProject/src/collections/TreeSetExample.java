package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> ts1 = new TreeSet<>();
		ts1.add(100);
		ts1.add(50);
		ts1.add(150);
		ts1.add(25);
		ts1.add(75);
		ts1.add(125);
		ts1.add(175);
		ts1.add(175);
//		ts1.add(null);   // Null values are not allowed by Queue

		System.out.println(ts1);
		System.out.println("*****Through Iterator Traversal******");
		Iterator itr = ts1.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
	}

}
