package java8;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleComparableExample {

	static class Student implements Comparable<Student> {
		int age;
		String name;
		String tech;

		public Student(int age, String name, String tech) {
			super();
			this.age = age;
			this.name = name;
			this.tech = tech;
		}

		public Student() {

		}

		@Override
		public String toString() {
			return "Student [age=" + age + ", name=" + name + ", tech=" + tech + "]";
		}

		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			int value;
			value = this.tech.length() - o.tech.length();
			return value;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(23, "Sai", "Java"));
		al.add(new Student(55, "Manju", "JEE"));
		al.add(new Student(24, "Chandu", "React"));

//		System.out.println(al);

		Collections.sort(al);

		System.out.println(al);
		// [Student [age=23, name=Sai, tech=Java], Student [age=55, name=Manju,
		// tech=JEE], Student [age=24, name=Chandu, tech=React]]
		// Without toString() method : [com.demo.Student@76ed5528,
		// com.demo.Student@2c7b84de, com.demo.Student@3fee733d]

//		for (Student s : al) {
//			
//			System.out.println("hashCode value: "+s.hashCode());			
//			System.out.println("getClass method: "+s.getClass());
//			System.out.println("getClass().getName() method: "+s.getClass().getName());
//			System.out.println("Integer.toHexString(s.hashCode()) value: "+Integer.toHexString(s.hashCode()));
//			System.out.println("Final toString() method return value: "+s.getClass().getName() + "@" + Integer.toHexString(s.hashCode()));
//			System.out.println();
//			
//		}

	}

}
