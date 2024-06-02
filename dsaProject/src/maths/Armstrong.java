package maths;

import java.util.Scanner;

public class Armstrong {
//	public static void main(String[] args) {
//		int n = 153, s = 0, temp = n, r;
//		while (n > 0) {
//			r = n % 10;
//			s = s + (r * r * r);
//			n = n / 10;
//		}
//		if (s == temp) {
//			System.out.println("armstrong");
//		} else {
//			System.out.println("not armstrong");
//		}
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int length = 0;
		int result = 0, rem = 0, userInput = input;

		while (input > 0) {
			input = input / 10;
			length++;
		}
		input = userInput;
		if (length > 0) {
			while (input > 0) {
				rem = input % 10;
				result = result + power(rem, length);
				input = input / 10;
			}
		}

		if (result == userInput) {
			System.out.println(userInput + " is armstrong number");
		} else {
			System.out.println(userInput + " is Not an armstrong number");
		}
	}

	public static int power(int rem, int length) {
		int total = 1;
		for (int i = 1; i <= length; i++) {
			total = total * rem;
		}
		return total;
	}

}
