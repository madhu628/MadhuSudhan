package binarySearch;

public class PeakIndex {
	public static void main(String[] args) {
		int[] a = { 3, 4, 5, 1 };
		int n = a.length;

		int res = peak(a, n);
		System.out.println(res);
	}

	private static int peak(int[] a, int n) {
		int s = 0, e = n - 1;
		int mid = s + (e - s) / 2;
		while (s < e) {
			if (a[mid] < a[mid + 1]) {
				s = mid + 1;
			} else {
				e = mid;
			}
			mid = s + (e - s) / 2;
		}
		return s;
	}
}
