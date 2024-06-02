package maths;

public class PlusOne {
	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 5 };
		int[] result = plusOne(a);
		for (int num : result) {
			System.out.print(num + " ");
		}
	}

	public static int[] plusOne(int[] a) {
		int n = a.length;
		for (int i = n - 1; i >= 0; i--) {
			if (a[i] < 9) {
				a[i]++;
				return a;
			} else {
				a[i] = 0;
			}
		}
		int[] a1 = new int[a.length + 1];
		a[0] = 1;
		return a1;
	}

}
