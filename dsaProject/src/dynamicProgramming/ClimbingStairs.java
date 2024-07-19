package dynamicProgramming;

public class ClimbingStairs {

	public static void main(String[] args) {

		System.out.println(climbingStairs(3));
	}

	private static int climbingStairs(int n) {

		if (n <= 2)
			return n;
		// Create a dp array to store the number of ways to reach each step
//		int[] dp = new int[n + 1];
//		dp[1] = 1;
//		dp[2] = 2;
//		// Fill the dp array from dp[3] to dp[n]. using the relation dp[i] = dp[i - 1] + dp[i - 2]
//		for (int i = 3; i <= n; i++) {
//			dp[i] = dp[i - 1] + dp[i - 2];
//
//		}
//		// The answer is the number of ways to reach the nth step
//		return dp[n];
//		Time Complexity: O(n) since we are iterating through the array once.
//		Space Complexity: O(n) because we are using an array of size n+1 to store the results.
		
		
		int first = 1;
        int second = 2;
        
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        
        return second;
		//O(1) space complexity) since it only keeps track of the last two computed values instead of using an array to store all values up to n
		//The time complexity is O(n) as it processes each step exactly once
		
	}

}
