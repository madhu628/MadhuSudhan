package arrays;

public class MoveZeros {
	public static void main(String[] args) {
		int[] a = { 0, 1, 0, 3, 12, 0 };
		int n = a.length;
		moveZeros(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	private static void moveZeros(int[] a) {
		int i = 0;
		for (int j = 0; j < a.length; j++) {
			if (a[j] != 0) {
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				i++;
			}
		}
	}
}
