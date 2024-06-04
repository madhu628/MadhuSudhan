package arrays;

public class MissingElement {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 9 };
		int n = a.length;
		System.out.println(missingElement(a, n));

	}

	private static int missingElement(int[] a, int n) {

		int actualSum = 0;
		// Calculate the sum of the first n+1 natural numbers
		int expectedSum = ((n + 1) * (n + 2)) / 2;

		// Calculate the sum of elements in the array
		for (int i = 0; i < n; i++) {
			actualSum += a[i];
		}
		// The difference between the expected sum and the actual sum is the missing
		// element
		return expectedSum - actualSum;
	}
}
