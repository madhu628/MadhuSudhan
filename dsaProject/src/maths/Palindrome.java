package maths;

public class Palindrome {
	public static void main(String[] args) {
		int n = 121, temp = n, rev = 0, r;
		while (n > 0) {
			r = n % 10;
			rev = (rev * 10) + r;
			n = n / 10;
		}
		if (temp == rev) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}

}
