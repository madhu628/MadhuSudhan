package collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		Queue<Integer> pq1 = new PriorityQueue();
		pq1.add(100);
		pq1.add(50);
		pq1.add(150);
		pq1.add(25);
		pq1.add(75);
		pq1.add(125);
		pq1.add(175);
//		pq1.add(null);   // Null values are not allowed by Queue

		System.out.println(pq1);

		System.out.println("****************************************************************");
		Iterator itr = pq1.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
	}

}
