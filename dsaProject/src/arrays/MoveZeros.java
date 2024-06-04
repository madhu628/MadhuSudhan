package arrays;

public class MoveZeros {
	public static void main(String[] args) {
		int[] a = { 0, 1, 0, 3, 12, 0 };
		int n = a.length;
		moveZeros(a, n);
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}

	private static void moveZeros(int[] a, int n) {
		int i = 0;
		for (int j = 0; j < n; j++) {
			if (a[j] != 0) {
				// Swap non-zero elements with the first zero element encountered
				// If i and j equal, it means the current element is already in the correct
				// position, and no swap is necessary.
				if (i != j) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
				i++;
			}
		}
	}
}
