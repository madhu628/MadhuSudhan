package arrays;

public class SearchElement {
//	public static void main(String[] args) {
//		int a[] = { 3, 6, 9, 2, 6, 9, 2, 8 };
//		int n = a.length, temp = 2;
//		
//		int index = -1;
//		for (int i = 0; i < n; i++) {
//			if (a[i] == temp) {
//				index = i;
//				break;
//			}
//		}
//		if (index == -1) {
//			System.out.println("not exists");
//		} else {
//			System.out.println("exists" + "  " + index);
//		}
//	}

	public static void main(String[] args) {
		int[] a = { 3, 6, 9, 2, 6, 9, 2, 8 };
		int temp = 2;

		int index = findElementIndex(a, temp);
		if (index == -1) {
			System.out.println("Element " + temp + " does not exist in the array.");
		} else {
			System.out.println("Element " + temp + " exists at index " + index + ".");
		}
	}

	private static int findElementIndex(int[] a, int temp) {
		if (a == null || a.length == 0) {
			return -1; // Handle empty array or null array case
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == temp) {
				return i;
			}
		}
		return -1; // Element not found
	}

}
