package arrays;

public class MaximumSubArray {

	public static void main(String[] args) {
		int[] a = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int n = a.length;
		//System.out.println(Maxelement(a,n));
		
		int result = Maxelement(a, n);
		
		System.out.println(result);
	}

	private static int Maxelement(int a[],int n) {
		
		// Handle edge case: empty array
	    if (n == 0) {
	        return 0; // or any other suitable value based on requirements
	    }
		
		int sum = 0, max = a[0];
		for (int i = 1; i < n; i++) {
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
