package maths;

public class Palindrome {
	public static void main(String[] args) {
		int n = 121, temp = n, s = 0, r;
		while (n > 0) {
			r = n % 10;
			s = (s * 10) + r;
			n = n / 10;
		}
		if (temp == s) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}

}
