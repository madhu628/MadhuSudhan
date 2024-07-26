package arrays2;

public class MinimumRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2, 3 };
		int ans = findMin(arr);
		int ans1 = findMin1(arr);
		int ans2 = findMin2(arr);
		System.out.println("The minimum element is: " + ans);
		System.out.println("The minimum element is: " + ans1);
		System.out.println("The minimum element is: " + ans2);
	}

	//brute-force
	public static int findMin(int[] arr) {
		int n = arr.length; // size of the array.
		int mini = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			// Always keep the minimum.
			mini = Math.min(mini, arr[i]);
		}
		return mini;
	}

	//better
	public static int findMin1(int[] arr) {
		int low = 0, high = arr.length - 1;
		int ans = Integer.MAX_VALUE;
		while (low <= high) {
			int mid = (low + high) / 2;

			// if left part is sorted:
			if (arr[low] <= arr[mid]) {
				// keep the minimum:
				ans = Math.min(ans, arr[low]);

				// Eliminate left half:
				low = mid + 1;

			} else { // if right part is sorted:

				// keep the minimum:
				ans = Math.min(ans, arr[mid]);

				// Eliminate right half:
				high = mid - 1;
			}
		}
		return ans;
	}

	//optimal
	public static int findMin2(int[] arr) {
		int low = 0, high = arr.length - 1;
		int ans = Integer.MAX_VALUE;
		while (low <= high) {
			int mid = (low + high) / 2;

			// search space is already sorted
			// then arr[low] will always be
			// the minimum in that search space:
			if (arr[low] <= arr[high]) {
				ans = Math.min(ans, arr[low]);
				break;
			}

			// if left part is sorted:
			if (arr[low] <= arr[mid]) {
				// keep the minimum:
				ans = Math.min(ans, arr[low]);

				// Eliminate left half:
				low = mid + 1;

			} else { // if right part is sorted:

				// keep the minimum:
				ans = Math.min(ans, arr[mid]);

				// Eliminate right half:
				high = mid - 1;
			}
		}
		return ans;
	}

}
