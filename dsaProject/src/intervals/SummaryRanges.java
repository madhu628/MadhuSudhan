package intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	public static void main(String[] args) {

		SummaryRanges sr = new SummaryRanges();

		int[] nums = { 0, 1, 2, 4, 5, 7 }; // Output: [0->2, 4->5, 7]

		System.out.println(sr.summaryRanges(nums));

		int[] nums2 = { 0, 2, 3, 4, 6, 8, 9 };

		System.out.println(sr.summaryRanges(nums2)); // Output: [0, 2->4, 6, 8->9]

	}

	private List<String> summaryRanges(int[] nums) {
		List<String> ranges = new ArrayList<>();

		if (nums == null || nums.length == 0)
			return ranges;
//		int start = nums[0];
//		for (int i = 1; i < nums.length; i++) {
//			// check if current number is not consecutive with the previous element
//			if (nums[i] != nums[i - 1] + 1) {
//				// Add the range to the list
//				if (start == nums[i - 1]) { //it means the range contains only one number. Add this single number to the list.
//					ranges.add(String.valueOf(start));
//				} else {
//					ranges.add(start + "->" + nums[i - 1]);
//				}
//				// update the start to the current number
//				start = nums[i];
//			}
//		}
//
//		// Add the last range
//		if (start == nums[nums.length - 1]) {
//			ranges.add(String.valueOf(start));
//		} else {
//			ranges.add(start + "->" + nums[nums.length - 1]);
//		}

		for (int i = 0; i < nums.length; i++) {
			int start = nums[i];
			while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
				i++;
			}
			if (start != nums[i]) {
				ranges.add("" + start + "->" + nums[i]);
			} else {
				ranges.add("" + start);
			}
		}

		return ranges;
	}

}
