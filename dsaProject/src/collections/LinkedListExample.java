package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {
	public static void main(String[] args) {

		List<Integer> ll = new LinkedList<>();
		ll.add(5);
		ll.add(15);
		ll.add(20);
		ll.add(null);
		ll.add(10);
		ll.add(null);
		System.out.println("ll before manipulation:" + ll);
		System.out.println("value at index 1 is :" + ll.get(1));
		
		System.out.println("***********");

		ll.add(1, 10);
		System.out.println("ll after manipulation:" + ll);
		System.out.println("value at index 1 is after manipulation:" + ll.get(1));
		
		System.out.println("***********");

		LinkedList<Comparable> ll1 = new LinkedList<Comparable>();
		ll1.add("SaiCharan");
		ll1.add('M');
		ll1.add(24);
		ll1.add(5.7);
		ll1.add(true);
		ll1.addFirst(10); // It supports bcz of implementing Deque
		ll1.addLast(20); // It supports bcz of implementing Deque
		ll1.add(null);
		ll1.add(null);
		ll1.add(null);
		System.out.println(ll1);

		System.out.println("***********");
		ListIterator<Comparable> litr = ll1.listIterator();
		while (litr.hasNext()) {
			System.out.print(litr.next() + "\t");
		}

		System.out.println("***********");
		Iterator<Comparable> itr = ll1.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
	}

}
