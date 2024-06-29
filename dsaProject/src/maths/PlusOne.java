package maths;

public class PlusOne {
	public static void main(String[] args) {
		int[] a = { 9, 9, 0 };
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
				a[i] = 1;
			}
		}
		int[] digits = new int[a.length + 1];
		digits[0] = 1;
		return digits;
	}

}
