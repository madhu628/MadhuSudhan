package arrays;

//the majority element in an array, which is an element that appears more than n/2 times. 

import java.util.HashMap;
import java.util.Map;

public class MajorityEle3 {
	public int findMajorEle(int a[]) {
		int n = a.length;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (hm.containsKey(a[i])) {
				int count = hm.get(a[i]) + 1;
				if (count > n / 2) {

					return a[i];
				}

				else {
					hm.put(a[i], count);
				}

			} else {
				hm.put(a[i], 1);
			}
		}

		// if the control reaches here, then it means
		// the majority element is not found.
		return -1;  // Return null if no majority element is found

	}

	// main method
	public static void main(String[] argvs) {
		// creating an object of the class MajorityEle3
		MajorityEle3 obj = new MajorityEle3();

		// input array
		int a[] = { 5, 1, 2, 1, 1, 3, 4, 9, 9, 0, 1, 2 };
		int s = a.length;
		System.out.println("For the input array.");
		for (int i = 0; i < s; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		int ans = obj.findMajorEle(a);
		if (ans != -1) {
			System.out.println("The majority element is: " + ans);
		} else {
			System.out.println("The majority element is not found.");
		}

	}

//	public static void main(String[] args) {
//		int[] a = { 1, 1, 2, 3, 1, 5, 1, 5, 3, 1 };
//		Integer result = majority(a);
//		if (result != null) {
//			System.out.println("Majority element: " + result);
//		} else {
//			System.out.println("No majority element found.");
//		}
//	}

//	private static Integer majority(int[] a) {
//		int n = a.length;
//		Map<Integer, Integer> map = new HashMap<>();
//		for (int num : a) {
////			if (!map.containsKey(num)) {
////				map.put(num, 1);
////			} else {
////				map.put(num, map.get(num) + 1);
////			}
//			map.put(num, map.getOrDefault(num, 0) + 1); 
//
//			if (map.get(num) > n / 2) {
//				return num;
//			}
//		}
//		return null; // Return null if no majority element is found
//	}
}
