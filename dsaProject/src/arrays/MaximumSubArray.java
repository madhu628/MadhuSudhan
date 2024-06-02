package arrays;

public class MaximumSubArray {

	public static void main(String[] args) {
		int[] a = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(Maxelement(a));
	}

	private static int Maxelement(int a[]) {
		int n = a.length;
		int sum = 0, max = a[0];
		for (int i = 0; i < n; i++) {
			sum += a[i];
			if (max < sum) {
				max = sum;
			}
			if (sum < 0)
				sum = 0;
		}
		return max;
	}
}
