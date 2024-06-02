package twoDArrays;

public class SearchMatrix {
	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 } };
		int n = a.length;
		int m = a[0].length;
		int target = 130;
		boolean isSearch = searchMatrix(a, n, m, target);

		if (isSearch) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}
	}

	private static boolean searchMatrix(int[][] a, int n, int m, int target) {
		int rowIndex = 0, colIndex = m - 1;
		while (rowIndex < n && colIndex >= 0) {
			int element = a[rowIndex][colIndex];
			if (element == target)
				return true;
			if (element < target)
				rowIndex++;
			else
				colIndex--;
		}
		return false;
	}

}
