package sortings;

public class NormalSorting {

	public static void main(String[] args) {
		int[] nums = { 32, 56, 21, 8, 65, 2 };
		int cur, temp;

		for (int i = 0; i < nums.length; i++) {
			cur = nums[i];
			for (int j = 0; j < nums.length; j++) {
				if (cur < nums[j]) {
					temp = nums[j]; // 21
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		for (int a : nums) {
			System.out.print(a + "\t");
		}
	}

}
