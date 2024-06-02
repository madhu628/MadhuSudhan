package arrays;

public class SwapAlternates {

	public static void main(String[] args) {

		int[] a = { 1, 5, 3, 7, 9, 2 };

		swap(a, 6);
		for (int i = 0; i < 6; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("**********************");

		print(a, 6);

	}

	private static void print(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}

	}

	private static void swap(int[] a, int n) {

		for (int i = 0; i < n; i++) {
			if (i + 1 < n) {
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
		}

	}

}