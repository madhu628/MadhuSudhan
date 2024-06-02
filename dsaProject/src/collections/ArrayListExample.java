package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		List<Integer> al1 = new ArrayList<>();
		al1.add(5);
		al1.add(15);
		al1.add(20);
		al1.add(null);
		al1.add(20);
		al1.add(null);

		System.out.println("al1 before manipulation:" + al1);
		System.out.println("value at index 1 is :" + al1.get(1));
		
		System.out.println("****************");

		al1.add(1, 10);
		System.out.println("al1 after manipulation:" + al1);
		System.out.println("value at index 1 is after manipulation:" + al1.get(1));
		
		
		System.out.println("****************");

		ArrayList<Comparable> al2 = new ArrayList<Comparable>();
		al2.add("Madhu");
		al2.add('M');
		al2.add(24);
		al2.add(5.7);
		al2.add(true);
		System.out.println("al2:" + al2);
		
		System.out.println("****************");

		ArrayList<Comparable> al3 = new ArrayList<Comparable>();
		al3.add("Hyderabad");
		al3.add("Infosys");
		al3.add(2.0);
		al3.add(null);
		al3.add(null);
		al3.add(null);
		System.out.println("al3:" + al3);
		
		System.out.println("****************");

		al2.addAll(al3);
		System.out.println("al2+al3:" + al2);
		
		System.out.println("****************");

		System.out.println("*****Forward******");
		ListIterator<Comparable> litr = al2.listIterator();

		while (litr.hasNext()) {
			System.out.print(litr.next() + "\t");
		}

		System.out.println();
		System.out.println("*****Reverse******");
		while (litr.hasPrevious()) {
			System.out.print(litr.previous() + "\t");
		}

		System.out.println();
		System.out.println("*****with Normal Iterator ******");
		Iterator<Comparable> itr = al2.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}

	}

}
