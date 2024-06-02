package twoDArrays;

import java.util.ArrayList;

public class PrintLikeWave {

	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 } };
		int n = a.length;
		int m = a[0].length;
		int sum = wavePrint(a, n, m);
		System.out.println(sum);
	}

	private static int wavePrint(int[][] a, int n, int m) {

		int sum = 0;
		for (int col = 0; col < m; col++) {
			if (col % 2 == 1) {
				for (int row = n - 1; row >= 0; row--) {
					System.out.print(a[row][col] + " ");
					sum += a[row][col];
				}
			} else {
				for (int row = 0; row < n; row++) {
					System.out.print(a[row][col] + " ");
					sum += a[row][col];
				}
			}

		}
		System.out.println();
		return sum;
	}

}
