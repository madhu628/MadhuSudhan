package collections;

import java.util.Enumeration;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Object> s1 = new Stack<Object>();
		s1.push("Madhu");
		s1.push(24); // push-add new element into the Stack
		s1.push(2.0);
		s1.push(true);
		s1.push("Infosys");
		System.out.println(s1);

		System.out.println(s1.peek()); // peek - returns the top element available on Stack
		System.out.println(s1.pop()); // pop- deletes the top element available on Stack
		System.out.println(s1);

		System.out.println("*****************");
		Enumeration<Object> enumeration = s1.elements();
		while (enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement() + "\t");
		}

	}

}
