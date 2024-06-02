package arrays;

public class RotateArray {
	public static void main(String[] args) {
		int[] a = { 0, 1, 0, 3, 12, 0 };
		int n = a.length;
		int k = 2;
		rotate(a, n, k);
		for (int i = 0; i < a.length; i++) {
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
		k = k % n;
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			temp[(i + k) % n] = a[i];

		}
		for (int i = 0; i < n; i++) {
            a[i] = temp[i];
        }
	}

}
