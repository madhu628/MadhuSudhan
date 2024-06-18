package hashmap;

public class HappyNumber {
	public static void main(String[] args) {
		int n = 19;
		boolean result = isHappy(n);
		System.out.println("Is " + n + " a happy number? " + result); // Expected output: true
	}

	public static boolean isHappy(int n) {

//		//using a Set
//		Set<Integer> seen = new HashSet<>();//Use a Set to record all numbers
//		while (n != 1 && !seen.contains(n)) {
//			seen.add(n);
//			n = getNext(n);
//		}
//		return n == 1;

		// using Floyd’s Cycle-Finding Algorithm
		int slow = n;
		int fast = getNext(n);
		while (fast != 1 && slow != fast) {
			slow = getNext(slow);
			fast = getNext(getNext(fast));
		}
		return fast == 1;

	}

	private static int getNext(int n) {
		int totalSum = 0;
		while (n > 0) {
			int digit = n % 10;
			totalSum += digit * digit;
			n /= 10;
		}
		return totalSum;
	}
}

//Time Complexity: O(log n) per iteration since the number of digits in n determines the time taken to compute the sum of squares.
//Space Complexity: O(1) for Floyd’s algorithm and O(log n) for the set approach (to store digits of n)







