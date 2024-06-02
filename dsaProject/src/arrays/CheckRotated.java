//check if the array is sorted and rotated
package arrays;

public class CheckRotated {
	public static void main(String[] args) {
		int[] a = { 3, 4, 5, 1, 2 };
		int n = a.length;
		boolean isRotated = check(a, n);
		
		if(isRotated) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

	private static boolean check(int[] a, int n) {
		int count = 0;
		for (int i = 1; i < n; i++) {
			if (a[i - 1] > a[i]) {
				count++;
			}
		}
		if (a[n - 1] > a[0]) {
			count++;
		}
		return count <= 1;

	}

}
