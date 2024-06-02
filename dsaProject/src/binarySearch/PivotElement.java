package binarySearch;

public class PivotElement {

	public static void main(String[] args) {
		int[] a = {2,5,9,3,6,8,3,1};
		int n = a.length;
		int res = pivot(a, n);
		System.out.println(res);
	}

	private static int pivot(int[] a, int n) {
		int s = 0, e = n - 1;
		int mid = s + (e - s) / 2;
		
		while (s < e) {
			if (a[mid] >=a[0]) {
				s = mid + 1;
			} else {
				e = mid;
			}
			mid = s + (e - s) / 2;
		}
		return s;
	}
}
