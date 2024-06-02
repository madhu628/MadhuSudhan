package oops;

import java.util.Arrays;
import java.util.List;

public class Poly {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3);
		B a = new B();
		a.m2();
		a.m1();

		String s1 = "sai";
		String s2 = new String("sai");
		String s3 = "sai";
	}

}

class A {
	public static void m1() {
		System.out.println("Parent class");
	}

	public void m2() {
		System.out.println("Parent class of m2");
	}
}

class B extends A {
	public static void m1() {
		System.out.println("Child class");
	}

	public void m2() {
		System.out.println("Child class of m2");
	}
}
