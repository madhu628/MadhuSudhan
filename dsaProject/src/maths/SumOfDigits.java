package maths;

public class SumOfDigits {

	public static void main(String[] args) {
		int n = 12345, s = 0, r;
		while (n > 0) {
			r = n % 10;
			s = s + r;
			n = n / 10;
		}
		System.out.println(s);
	}

}
