package arrays2;

public class MaximumSubarraySum {

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int n = arr.length;
		int maxSum = maxSubarraySum(arr, n);
		int maxSum1 = maxSubarraySum(arr, n);
		int maxSum2 = maxSubarraySum(arr, n);
		System.out.println("The maximum subarray sum is: " + maxSum);
		System.out.println("The maximum subarray sum is: " + maxSum1);
		System.out.println("The maximum subarray sum is: " + maxSum2);
	}

	public static int maxSubarraySum(int[] arr, int n) {
		int maxi = Integer.MIN_VALUE; // maximum sum

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				// subarray = arr[i.....j]
				int sum = 0;

				// add all the elements of subarray:
				for (int k = i; k <= j; k++) {
					sum += arr[k];
				}

				maxi = Math.max(maxi, sum);
			}
		}

		return maxi;
	}

	public static int maxSubarraySum1(int[] arr, int n) {
		int maxi = Integer.MIN_VALUE; // maximum sum

		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				// current subarray = arr[i.....j]

				// add the current element arr[j]
				// to the sum i.e. sum of arr[i...j-1]
				sum += arr[j];

				maxi = Math.max(maxi, sum); // getting the maximum
			}
		}

		return maxi;
	}

	public static int maxSubarraySum2(int[] arr, int n) {
		int maxi = Integer.MIN_VALUE; // maximum sum

		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				// current subarray = arr[i.....j]

				// add the current element arr[j]
				// to the sum i.e. sum of arr[i...j-1]
				sum += arr[j];

				maxi = Math.max(maxi, sum); // getting the maximum
			}
		}

		return maxi;
	}

}
