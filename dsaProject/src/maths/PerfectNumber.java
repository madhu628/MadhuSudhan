package maths;

import java.util.Scanner;

//perfect number is a positive integer that is equal to the sum of its proper divisors, 
//The proper divisors of 6 are 1, 2, and 3. If you sum these divisors:
//1+2+3=6
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int total = 0;
		for (int i = 1; i < input; i++) {
			if (input % i == 0) {
				total = total + i;
			}
		}
		if (total == input) {
			System.out.println(input + " is a perfect number");
		} else {
			System.out.println(input + " is not a perfect number");
		}
	}

}
