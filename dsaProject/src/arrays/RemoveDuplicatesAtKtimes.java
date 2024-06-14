package arrays;

public class RemoveDuplicatesAtKtimes {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int newLength = removeDuplicates(nums);
		System.out.println("New length: " + newLength);
		System.out.print("Array after removing duplicates: ");
		for (int i = 0; i < newLength; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		// Use k to track the end of the array with allowed duplicates
		int k = 0;

		for (int i = 0; i < nums.length; i++) {
			// Allow the element if it's the first occurrence or if it's the second
			// occurrence
			// or if the current element is different from the one two positions back in the
			// result array
			if (k < 2 || nums[i] != nums[k - 2]) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
	}
}
