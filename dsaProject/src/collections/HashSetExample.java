package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Set<Integer> hs = new HashSet<>();
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

		HashSet<Comparable> hs1 = new HashSet<Comparable>();
		hs1.add("Madhu");
		hs1.add('M');
		hs1.add(24);
		hs1.add(24);
		hs1.add(5.7);
		hs1.add(true);
		hs1.add(null);
		hs1.add(null);

		System.out.println(hs1);

		System.out.println("***********");
		Iterator<Comparable> itr = hs1.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		

	}

}
