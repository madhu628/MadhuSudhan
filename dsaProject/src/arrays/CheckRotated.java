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
		// Check for descending order breaks
		//The loop checks each pair of adjacent elements. If a[i - 1] > a[i], it increments count.
		for (int i = 1; i < n; i++) {
			if (a[i - 1] > a[i]) {
				count++;
			}
		}
		 // Check if the last element is greater than the first element
		if (a[n - 1] > a[0]) {
			count++;
		}
		 // If count is less than or equal to 1, the array is sorted and rotated
		return count <= 1;

	}

}
