package arrays2;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraywithsumK {

	public static void main(String[] args) {
		int[] a = { -1, 1, 1 };
		int k = 1;
		int len = getLongestSubarray(a, k);
		int len1 = getLongestSubarray1(a, k);
		int len2 = getLongestSubarray2(a, k);

		System.out.println("The length of the longest subarray is: " + len);
		System.out.println("The length of the longest subarray is: " + len1);
		System.out.println("The length of the longest subarray is: " + len2);

	}

	// brute force
	public static int getLongestSubarray(int[] a, int k) {
		int n = a.length; // size of the array.

		int len = 0;
		for (int i = 0; i < n; i++) { // starting index
			for (int j = i; j < n; j++) { // ending index
				// add all the elements of
				// subarray = a[i...j]:
				int s = 0;
				for (int K = i; K <= j; K++) {
					s += a[K];
				}

				if (s == k)
					len = Math.max(len, j - i + 1);
			}
		}
		return len;
	}

	// better
	public static int getLongestSubarray1(int[] a, int k) {
		int n = a.length; // size of the array.

		int len = 0;
		for (int i = 0; i < n; i++) { // starting index
			int s = 0;
			for (int j = i; j < n; j++) { // ending index
				// add the current element to
				// the subarray a[i...j-1]:
				s += a[j];

				if (s == k)
					len = Math.max(len, j - i + 1);
			}
		}
		return len;
	}

	// optimal
	public static int getLongestSubarray2(int[] a, int k) {
		int n = a.length; // size of the array.

		Map<Integer, Integer> preSumMap = new HashMap<>();
		int sum = 0;
		int maxLen = 0;
		for (int i = 0; i < n; i++) {
			// calculate the prefix sum till index i:
			sum += a[i];

			// if the sum = k, update the maxLen:
			if (sum == k) {
				maxLen = Math.max(maxLen, i + 1);
			}

			// calculate the sum of remaining part i.e. x-k:
			int rem = sum - k;

			// Calculate the length and update maxLen:
			if (preSumMap.containsKey(rem)) {
				int len = i - preSumMap.get(rem);
				maxLen = Math.max(maxLen, len);
			}

			// Finally, update the map checking the conditions:
			if (!preSumMap.containsKey(sum)) {
				preSumMap.put(sum, i);
			}
		}

		return maxLen;
	}
}