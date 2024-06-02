package binarySearch;

public class FirstLastPosition {

	public static void main(String[] args) {
		int[] odd = { 1, 2, 3, 3, 5 };
		int[] even = {1,4,6,7,8,3};
		int index = first(odd, 5, 3);
		int index1 = last(even, 6, 3);
		System.out.println(index);
		System.out.println(index1);
	}

	private static int first(int[] a, int n, int key) {

		int s = 0, e = n - 1;
		int mid = s + (e - s) / 2, ans = -1;
		while (s <= e) {
			if (a[mid] == key) {
				ans = mid;
				e = mid - 1;
			} else if (key < a[mid]) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
			mid = s + (e - s) / 2;
		}
		return ans;

	}

	private static int last(int[] a, int n, int key) {

		int s = 0, e = n - 1;
		int mid = s + (e - s) / 2, ans = -1;
		while (s <= e) {
			if (a[mid] == key) {
				ans = mid;
				s = mid + 1;
			} else if (key < a[mid]) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
			mid = s + (e - s) / 2;
		}
		return ans;

	}

}
