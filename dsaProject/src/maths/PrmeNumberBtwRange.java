package maths;

import java.util.Scanner;

public class PrmeNumberBtwRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		if (start > end) {
			System.out.println("Invalid Range...");
			System.exit(0);
		}
		System.out.print("Prime Numbers Between " + start + " and " + end + " are:");

		for (int i = start; i <= end; i++) {
			int value = i, count = 0;
			for (int j = 2; j < value; j++) {
				if (value % j == 0) {
					count = count + 1;
					break;
				}
			}
			if (count == 0 && value != 1) {
				System.out.print("\t" + value);
			}
		}
	}

}
