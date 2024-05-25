package arrays;

public class Duplicates {
	public static void main(String[] args) {
		int a[] = { 1, 4, 8, 2, 6, 8, 4 };
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
