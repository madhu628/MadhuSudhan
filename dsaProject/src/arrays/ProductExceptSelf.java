package arrays;

import java.util.Arrays;

public class ProductExceptSelf {

	public static void main(String[] args) {

		int[] nums1 = { -1, 1, 0, -3, 3 };
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(productExceptSelf(nums1)));
	}

//	public static int[] productExceptSelf(int[] nums) {
//		int n = nums.length;
//		int ans[] = new int[n];
//		Arrays.fill(ans, 1); // Fill ans array with 1s initially
//		int curr = 1;// To store the current product of elements on the left side
//		for (int i = 0; i < n; i++) {
//			ans[i] *= curr;  // Multiply with the current product from the left
//			curr *= nums[i]; // Update the current product
//		}
//		curr = 1;// Reset current product for the right side
//		for (int i = n - 1; i >= 0; i--) {
//			ans[i] *= curr;  // Multiply with the current product from the right
//			curr *= nums[i]; // Update the current product
//		}
//		return ans;
//	}

	public static int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];

		// Initialize the result array with 1s
		for (int i = 0, tmp = 1; i < nums.length; i++) {
			result[i] = tmp;
			tmp *= nums[i];
		}

		// Multiply with the right products.
		for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
			result[i] *= tmp;
			tmp *= nums[i];
		}
		return result; 
	}

}
