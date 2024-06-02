package twoDArrays;

public class RowWiseSum {
	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 } };
		printSum(a, 3, 3);
	}

	private static void printSum(int[][] a, int i, int j) {

		for (int row = 0; row < 3; row++) {
			int sum = 0;
			for (int col = 0; col < 4; col++) {
				sum += a[row][col];
			}
			System.out.println(sum);
		}
	}

}
