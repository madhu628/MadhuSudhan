package sortings;

//
//Repeatedly steps through the list.
//Compares adjacent elements and swaps them if they are in the wrong order.
//Each pass places the next largest element in its correct position.


public class BubbleSort {
	public static void main(String[] args) {
		int[] a = { 9, 14, 3, 2, 43 };
		int n = a.length;
		bubbleSort(a, n);
//		int[] sortedArray = bubbleSort(a);
//		for (int num : sortedArray) {
//			System.out.print(num + " ");
//		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static int[] bubbleSort(int[] a, int n) {
		boolean swap = false;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swap = true;
				}
			}
			if (swap == false)
				break;
		}
		return a;
	}

}
