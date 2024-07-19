package binarySearch;

public class SearchInsert {

	public static void main(String[] args) {

		int[] nums1 = { 1, 3, 5, 6 };
		System.out.println(searchInsert(nums1, 5));
		System.out.println(searchInsert(nums1, 2));
		System.out.println(searchInsert(nums1, 7));

	}

	private static int searchInsert(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		//If the target is not found, the loop will terminate with left indicating
		//the correct insertion point for the target to maintain the sorted order.
		return left;
	}
}

//Time Complexity: 
//O(logn) because the binary search reduces the search space by half in each iteration.
//Space Complexity: 
//O(1) because we are using a constant amount of extra space


