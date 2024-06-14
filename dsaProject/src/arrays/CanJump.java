package arrays;

public class CanJump {
	
	public static void main(String[] args) {
		int[] nums = {3,2,1,0,4};
		System.out.println(canJump(nums));
	}

	private static boolean  canJump(int[] nums) {
		// Take curr variable to keep the current maximum jump...
        int curr = 0;
        // Traverse all the elements through loop...
        for (int i = 0; i < nums.length; i++) {
            // If the current index 'i' is less than current maximum jump 'curr'...
            // It means there is no way to jump to current index...
            // so we should return false...
            if (i > curr) {
                return false;
            }
            // Update the current maximum jump...
            curr = Math.max(curr, i + nums[i]);     // It’s possible to reach the end of the array...
        }
		return true;
		
	}

}
