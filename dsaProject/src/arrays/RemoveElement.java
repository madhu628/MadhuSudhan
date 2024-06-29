package arrays;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		int newLength = remove(nums, val);

		System.out.println(newLength);

		for (int i = 0; i < newLength; i++) {
			System.out.print(nums[i] + " ");
		}

		System.out.println(" **************");

		int[] modifiedArray = Arrays.copyOf(nums, newLength);

		System.out.println("Modified array: " + Arrays.toString(modifiedArray));

		for (int res : modifiedArray) {
			System.out.print(res + " ");
		}
		System.out.println();
	}

	private static int remove(int[] nums, int val) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				//nums[count] = nums[i];

				count++;
			}
		}

		return count;

	}

}
