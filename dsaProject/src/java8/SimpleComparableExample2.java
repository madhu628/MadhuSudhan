package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleComparableExample2 {

	class Student1 implements Comparable<Student1> {
		int sId;
		String name;
		String address;

		public Student1(int sId, String name, String address) {
			super();
			this.sId = sId;
			this.name = name;
			this.address = address;
		}

		public Student1() {
		}

		@Override
		public String toString() {
			return "Student1 [sId=" + sId + ", name=" + name + ", address=" + address + "]";
		}

		@Override
		public int compareTo(Student1 o) {
			return this.sId - o.sId;
		}

	}

	public static void main(String[] args) {

		SimpleComparableExample2 outerInstance = new SimpleComparableExample2();

		List<Student1> st = new ArrayList<>();
		st.add(outerInstance.new Student1(24, "SaiCharan", "Andhra"));
		st.add(outerInstance.new Student1(36, "Jyotirmaya", "Odisha"));
		st.add(outerInstance.new Student1(38, "Rajeswari", "Tamilnadu"));
		st.add(outerInstance.new Student1(16, "Mukesh", "Andhra"));
		st.add(outerInstance.new Student1(51, "Payal", "Odisha"));
		System.out.println("Before Sort:" + st);

		Collections.sort(st);
		System.out.println("After Sort:" + st);
	}

}
