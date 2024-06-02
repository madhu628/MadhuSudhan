package maths;

public class GCD {
	public static void main(String[] args) {
		int a = 4, b = 8;
		int res = gcd(a, b);
		System.out.println(res);
	}

	private static int gcd(int a, int b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	}

}
