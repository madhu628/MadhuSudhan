package maths;

import java.util.Scanner;

public class ArmStrongBtwRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		if (start > end) {
			System.out.println("Invalid Range...");
			System.exit(0);
		}
		System.out.print("Armstrong numbers between " + start + " and " + end + " are:");
		for (int i = 1; i <= end; i++) {
			int input = i, userInput = i, length = 0, total = 0, rem = 0;
			int result = 0;
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
			if (userInput == result) {
				System.out.print("\t" + result);
			}
		}
	}

	public static int power(int rem, int length) {
		int total = rem;
		for (int i = 1; i < length; i++) {
			total = total * rem;
		}
		return total;
	}

}
