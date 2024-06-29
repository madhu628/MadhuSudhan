package java8;

import java.util.ArrayList;
import java.util.List;

//Comparator when you want to define multiple ways to compare objects, typically outside the class.

public class GoodComparatorExample {

	public static void main(String[] args) {

		List<Student5> list = new ArrayList<>();
		Student5 s1 = new Student5(24, 123, "madhu");
		Student5 s2 = new Student5(25, 12445, "sudhan");
		Student5 s3 = new Student5(2, 33553, "reddy");

		list.add(s1);
		list.add(s2);
		list.add(s3);

		// Approach 1
//		Comparator<Student> comparatorLamda = (stu1, stu2)->{
//			if(stu1.age == stu2.age)
//				return 0;
//			else if(stu1.age>stu2.age)
//				return -1;
//			else
//				return 1;
//		};
//		
//		list.sort(comparatorLamda);

		// Apporach -2
//		Collections.sort(list,comparatorLamda);

		// Approach-3
		list.sort((student1, student2) -> student1.age - student2.age);
		list.forEach(student -> System.out.println(student.age + "\t" + student.name));

//		for(Student s:list) {
//			System.out.println(s.age+"   "+s.name);
//		}

	}

}

class Student5 {
	int age;
	int rollNo;
	String name;

	public Student5(int age, int rollNo, String name) {
		this.age = age;
		this.rollNo = rollNo;
		this.name = name;
	}
}
