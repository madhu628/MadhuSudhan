package twoDArrays;

public class LargestSum {
	private static final int INT_MIN = 0;

	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 } };

		int sum = largest(a, 3, 3);
		System.out.println(sum);
	}

	private static int largest(int[][] a, int i, int j) {
		int maxi = INT_MIN;
		int rowIndex = 2;
		for (int row = 0; row < 3; row++) {
			int sum = 0;
			for (int col = 0; col < 4; col++) {
				sum += a[row][col];
			}
			if (sum > maxi)
				maxi = sum;
			   rowIndex = row;
		}
		System.out.println(maxi);
		return rowIndex;

	}

}
