package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		Set<Integer> hs = new LinkedHashSet<>();
		hs.add(100);
		hs.add(50);
		hs.add(100);
		hs.add(25);
		hs.add(null);
		hs.add(75);
		hs.add(125);
		hs.add(175);
		hs.add(175);
		hs.add(null);
		System.out.println("With Homogeneous data: " + hs);
		System.out.println("*************************************");

		LinkedHashSet lhs1 = new LinkedHashSet();
		lhs1.add("Madhu");
		lhs1.add('M');
		lhs1.add(24);
		lhs1.add(null);
		lhs1.add(24);
		lhs1.add(5.7);
		lhs1.add(true);
		lhs1.add(null);

		System.out.println(lhs1);
		System.out.println("***********");
		Iterator itr = lhs1.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		System.out.println("***********");
	}

}
