package maths;
// 2^10 % 2 = 0 ;

public class Modular {
	public static void main(String[] args) {

		int x = 2, n = 10, m = 2;
		int res = modular(x, n, m);
		System.out.println(res);

	}

	private static int modular(int x, int n, int m) {
		int res = 1;
		x = x % m;
		if (x == 0)
			return 0;
		while (n > 0) {
			if ((n & 1) == 1) {
				res = (res * x) % m;
			}
			n = n >> 1; // n = n / 2
			x = (x * x) % m; // Change x to x^2
		}
		return res;

	}
}
