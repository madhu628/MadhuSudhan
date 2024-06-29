package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Comparable when you want to define a natural ordering within the class

public class GoodComparableExample {

	public static void main(String[] args) {

		List<Student4> list = new ArrayList<>();
		Student4 s1 = new Student4(24, 123, "madhu");
		Student4 s2 = new Student4(25, 12445, "sudhan");
		Student4 s3 = new Student4(2, 33553, "reddy");

		list.add(s1);
		list.add(s2);
		list.add(s3);

		Collections.sort(list);

		// approach -1 for retrieving
		for (Student4 st : list) {
			System.out.println(st.rollNo + " " + st.name + " " + st.age);
		}

		System.out.println("************************");

		// approach -2 for retrieving
		list.forEach(st -> System.out.println(st.rollNo + " " + st.name + " " + st.age));

	}

}

class Student4 implements Comparable<Student4> {
	int age;
	int rollNo;
	String name;

	public Student4(int age, int rollNo, String name) {
		this.age = age;
		this.rollNo = rollNo;
		this.name = name;
	}

	public int compareTo(Student4 s) {
		if (age == s.age)
			return 0;
		if (age > s.age)
			return 1;
		else
			return -1;
	}
}
