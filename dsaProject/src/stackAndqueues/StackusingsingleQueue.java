package stackAndqueues;

import java.util.LinkedList;

public class StackusingsingleQueue {

	public static void main(String[] args) {
		stack s = new stack();
		s.push(3);
		s.push(2);
		s.push(4);
		s.push(1);
		System.out.println("Top of the stack: " + s.top());
		System.out.println("Size of the stack before removing element: " + s.size());
		System.out.println("The deleted element is: " + s.pop());
		System.out.println("Top of the stack after removing element: " + s.top());
		System.out.println("Size of the stack after removing element: " + s.size());
	}

}

class stack {
	private queue1 q = new queue1();

	public void push(int x) {
		int size = q.size(); // Store the current size of the queue
		q.enqueue(x);
		// Rotate the queue to move the new element to the front
		for (int i = 0; i < size(); i++) {
			q.enqueue(q.dequeue());
		}
	}

	public int pop() {
		return q.dequeue();
	}

	public int top() {
		return q.peek();
	}

	public int size() {
		return q.size();
	}

	public boolean isEmpty() {
		return q.isEmpty();
	}

}

class queue1 {
	private LinkedList<Integer> list = new LinkedList<>();

	public void enqueue(int x) {
		list.addLast(x);
	}

	public int dequeue() {
		if (list.isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return list.removeFirst();
	}

	public int peek() {
		if (list.isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return list.getFirst();
	}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}
}

