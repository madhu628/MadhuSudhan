package arrays;

public class MaxElement {
	public static void main(String[] args) {
		int[] a = { 1, 7, 8, 3, 56, 76 };
		System.out.println(maxElement(a));
		
	}

	private static int maxElement(int[] a) {
		int max = a[0];
		int n = a.length;
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
}
