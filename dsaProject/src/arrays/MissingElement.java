package arrays;

public class MissingElement {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 9 };
		int res = missingElement(a);
		System.out.println(res);
	}

	private static int missingElement(int[] a) {
		int n = a.length;
		int sum = ((n + 1) * (n + 2)) / 2;
		for (int i = 0; i < n; i++) {
			sum -= a[i];
		}
		return sum;
	}

}
