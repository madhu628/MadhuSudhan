package sortings;

//Divides the list into a sorted and an unsorted part.
//Repeatedly selects the smallest (or largest) element from the unsorted part and moves it to the end of the sorted part

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = { 9, 14, 3, 2, 43 };
		int n = a.length;
//		int[] sortedArray = selectionSort(a);
//		for (int num : sortedArray) {
//			System.out.print(num + " ");
//		}
		selectionSort(a, n);
		for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
	}

	private static int[] selectionSort(int[] a,int n ) {
		
		for (int i = 0; i < n - 1; i++) {
			int mini = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[mini]) {
					mini = j;
				}
			}
			int temp = a[mini];
			a[mini] = a[i];
			a[i] = temp;
		}
		return a;
	}
}
