package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArraydequeExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Deque<Integer> deque = new ArrayDeque<>();
		deque.add(10);
		deque.addLast(15);
		deque.add(20);
		deque.addFirst(5);
		deque.add(10);
//		deque.add(null);  // Null values are not allowed by Deque
		System.out.println("deque:" + deque);

		// The below operations will not support by ArrayDeque
//		deque.add(1, 10);		
//		System.out.println("value at index 1 is after manipulation:"+deque.get(1));

		System.out.println("***********");

		ArrayDeque<Comparable> ad1 = new ArrayDeque<Comparable>();
		ad1.add("Madhu"); // it will add element at Last
		ad1.add('M');
		ad1.add(24);
		ad1.add(5.7);
		ad1.add(true);
		System.out.println(ad1);

		System.out.println("***********");

		ad1.addFirst(1000);
		ad1.addLast(5000);
		ad1.add(200);
		ad1.add(200); // Duplicates are allowed
		System.out.println(ad1);

		System.out.println("***********");

		ad1.remove(); // FIFO --> First value it will remove
		System.out.println(ad1);

		System.out.println("***********");

		ad1.removeLast();
		System.out.println(ad1);

		System.out.println("***********");

		ad1.removeFirst();
		System.out.println(ad1);

		System.out.println("***********");

		Iterator<Comparable> itr = ad1.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}

		System.out.println();
		System.out.println("****DescendingIterator*******");
		Iterator<Comparable> ditr = ad1.descendingIterator();
		while (ditr.hasNext()) {
			System.out.print(ditr.next() + "\t");
		}

	}

}
