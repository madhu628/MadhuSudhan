package arrays;

public class RotateArray {
	public static void main(String[] args) {
		int[] a = { 0, 1, 0, 3, 12, 0 };
		int n = a.length;
		int k = 2;

		rotate(a, n, k);
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
//		print(a);

	}

//	private static void print(int[] a) {
//		for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//
//	}

	private static void rotate(int[] a, int n, int k) {
		k = k % n; // Handle cases where k is larger than n
		reverse(a, 0, n - 1); // Reverse the entire array
		reverse(a, 0, k - 1); // Reverse the first k elements to correct their order
		reverse(a, k, n - 1); // Reverse the remaining n - k elements to correct their order.

//		int[] temp = new int[n];
//		for (int i = 0; i < n; i++) {
//			temp[(i + k) % n] = a[i];
//
//		}
//		for (int i = 0; i < n; i++) {
//            a[i] = temp[i];
//        }
	}

	private static void reverse(int[] a, int start, int end) {

		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
}
