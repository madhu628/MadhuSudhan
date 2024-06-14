package maths;

public class SqrtCalculator {
	public int mySqrt(int x) {
		if (x < 2)
			return x; // Square root of 0 or 1 is the number itself

		int left = 1, right = x, result = 0;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			//The check mid <= x / mid is used instead of mid * mid <= x to avoid potential overflow when mid is large.
			if (mid <= x / mid) {
				result = mid; // Update result to mid if mid*mid <= x and search in right half of mid
				left = mid + 1; // Try for a larger number
			} else { //search in the left half of mid
				right = mid - 1; // Try for a smaller number
			}
		}
		return result;
	}

	public static void main(String[] args) {
		SqrtCalculator calculator = new SqrtCalculator();
		int x = 8;
		int result = calculator.mySqrt(x);
		System.out.println("The integer part of the square root of " + x + " is " + result);
	}
}


