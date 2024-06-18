package prefixSum;

public class PivotIndex {
	public static void main(String[] args) {
		int[] nums = { 1, 7, 3, 6, 5, 6 };
		int pivotIndex = findPivotIndex(nums);
		System.out.println("Pivot Index: " + pivotIndex); // Expected output: 3
	}

	private static int findPivotIndex(int[] nums) {
		int totalSum = 0;
		int leftSum = 0;

		// Calculate total sum of the array
		for (int num : nums) {
			totalSum += num;
		}

		// Iterate through the array and check for pivot index
		for (int i = 0; i < nums.length; i++) {
			// Check if left sum equals right sum
			if (leftSum == totalSum - leftSum - nums[i]) {
				return i;
			}
			leftSum += nums[i];//upadate dding the current element
		}

		return -1; // Return -1 if no pivot index is found
	}
}


//Time Complexity: O(n), where n is the number of elements in the array. The array is traversed twice, once for calculating the total sum and once for finding the pivot index.
//Space Complexity: O(1), as only a fixed amount of additional space is used.
