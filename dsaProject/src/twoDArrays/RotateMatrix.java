package twoDArrays;

public class RotateMatrix {
	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 } };
		int n = a.length;
		int m = a[0].length;
		int target = 50;
		boolean isSearch = rotateMatrix(a, n, m, target);

		if (isSearch) {
			System.out.println("can rotate");
		} else {
			System.out.println("cannot rotate");
		}
	}

	private static boolean rotateMatrix(int[][] a, int n, int m, int target) {
		int start = 0, end = n * m - 1;

		int mid = start + (end - start) / 2;
		while (start <= end) {
			int element = a[mid / m][mid % m];
			if (element == target)
				return true;
			if (element < target)
				start = mid + 1;
			else
				end = mid - 1;
			mid = start + (end - start) / 2;

		}
		return false;
	}

}
