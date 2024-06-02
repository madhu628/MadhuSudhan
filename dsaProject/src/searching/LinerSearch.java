package searching;

public class LinerSearch {
//	public static void main(String[] args) {
//		int[] a = { 9, 14, 3, 2, 43 };
//		int n = a.length;
//		boolean found = linearSearch(a, n);
//
//		if (found) {
//			System.out.println("found");
//		} else {
//			System.out.println("not found");
//		}
//
//	}
//
//	private static boolean linearSearch(int[] a, int n) {
//		int key = 15;
//		for (int i = 0; i < n; i++) {
//			if (a[i] == key) {
//				return true;
//			}
//
//		}
//		return false;
//	}

	public static void main(String[] args) {
		int[] nums = { 32, 56, 21, 8, 65, 2 };
		int find = 8, count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == find) {
				System.out.println(find + " is found at index:" + i);
				count = 1;
				break;
			}
		}
		if (count == 0) {
			System.out.println(find + " is not found in the array");
		}

	}

}
