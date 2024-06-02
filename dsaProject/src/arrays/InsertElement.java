package arrays;

public class InsertElement {
	public static void main(String[] args) {

		int[] a = { 3, 6, 9, 3, 6, 9, 1, 8 };
		int n = a.length, p = 6, e = 1;
		int[] a1 = new int[n+1];
		for (int i = n - 1; i >= p - 1; i--) {
			a1[i + 1] = a[i];
		}
		a1[p - 1] = e;

		for (int  i = 0; i <= a1.length; i++) {
			System.out.println(a1[i]);
		}
	}

}
