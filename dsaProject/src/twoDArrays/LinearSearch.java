package twoDArrays;

public class LinearSearch {
	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 } };
		int target = 70;
		boolean found = isPresent(a, target);

		if (found) {
			System.out.println("present");
		} else {
			System.out.println("not present");
		}
	}

	private static boolean isPresent(int[][] a, int target) {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 4; col++) {
				if (a[row][col] == target) {
					return true;
				}
			}
		}
		return false;
	}

}
