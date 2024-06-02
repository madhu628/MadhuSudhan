package arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityEle3 {
//	public int findMajorEle(int arr[]) {
//		int size = arr.length;
//
//		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//
//		for (int i = 1; i < size; i++) {
//			if (hm.containsKey(arr[i])) {
//				int count = hm.get(arr[i]) + 1;
//				if (count > arr.length / 2) {
//
//					return arr[i];
//				}
//
//				else {
//					hm.put(arr[i], count);
//				}
//
//			} else {
//				hm.put(arr[i], 1);
//			}
//		}
//
//		// if the control reaches here, then it means
//		// the majority element is not found.
//		return -1;
//
//	}
//
//	// main method
//	public static void main(String[] argvs) {
//		// creating an object of the class MajorityEle3
//		MajorityEle3 obj = new MajorityEle3();
//
//		// input array
//		int arr[] = { 5, 1, 1, 1, 1, 1, 4, 9, 1, 0, 1, 2 };
//		int s = arr.length;
//		System.out.println("For the input array.");
//		for (int i = 0; i < s; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//		int ans = obj.findMajorEle(arr);
//		if (ans != -1) {
//			System.out.println("The majority element is: " + ans);
//		} else {
//			System.out.println("The majority element is not found.");
//		}
//
//	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 3, 4, 5, 1, 5, 6, 9 };
		System.out.println(majority(a));
	}

	private static int majority(int[] a) {
		int n = a.length;
		Map<Integer, Integer> map = new HashMap<>();
		int ret = 0;
		for (int a1 : a) {
			if (!map.containsKey(a1)) {
				map.put(a1, 1);
			} else {
				map.put(a1, map.get(a1) + 1);
			}

			if (map.get(a1) > a.length / 2) {
				ret = a1;
				break;
			}
		}
		return ret;
	}
}
