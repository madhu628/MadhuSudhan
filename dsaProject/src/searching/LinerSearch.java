package searching;

public class LinerSearch {
	public static void main(String[] args) {
		int[] a = { 9, 14, 3, 2, 43 };
		int n = a.length;
		boolean found = linearSearch(a, n);

		if (found) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}

	}

	private static boolean linearSearch(int[] a, int n) {
		int key = 15;
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				return true;
			}

		}
		return false;
	}

}
