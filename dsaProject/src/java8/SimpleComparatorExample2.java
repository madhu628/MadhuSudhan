package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 {
	int sId;
	String name;
	String state;

	public Student1(int sId, String name, String state) {
		this.sId = sId;
		this.name = name;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Student1{" + "sId=" + sId + ", name='" + name + '\'' + ", state='" + state + '\'' + '}';
	}
}

public class SimpleComparatorExample2 {

	class ComparatorImpl implements Comparator<Student1> {
		@Override
		public int compare(Student1 o1, Student1 o2) {
			return o1.sId - o2.sId;
		}
	}

	public static void main(String[] args) {
		// Create an instance of the outer class
		SimpleComparatorExample2 outerInstance = new SimpleComparatorExample2();

		List<Student1> st = new ArrayList<>();
		st.add(new Student1(24, "SaiCharan", "Andhra"));
		st.add(new Student1(36, "Jyotirmaya", "Odisha"));
		st.add(new Student1(38, "Rajeswari", "Tamilnadu"));
		st.add(new Student1(16, "Mukesh", "Andhra"));
		st.add(new Student1(51, "Payal", "Odisha"));
		System.out.println("Before Sort: " + st);

		// Use the outer class instance to create an instance of the inner class
		Comparator<Student1> com = outerInstance.new ComparatorImpl();

		Collections.sort(st, com);
		System.out.println("After Sort: " + st);
	}
}
