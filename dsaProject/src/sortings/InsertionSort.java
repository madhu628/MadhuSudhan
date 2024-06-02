package sortings;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = { 9, 14, 3, 2, 43 };
		int n = a.length;
		insertionSort(a, n);
//		int[] sortedArray = insertionSort(a);
//		for (int num : sortedArray) {
//			System.out.print(num + " ");
//		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

//	private static int[] insertionSort(int[] a,int n) {
//		
//		for (int i = 1; i < n; i++) {
//			int temp =a[i];
//			int j=i-1;
//			while(j>=0 && temp<a[j]) {
//				a[j+1]=a[j];
//				j--;
//			}
//			a[j+1]=temp;
//		}
//		return a;
//	}

	private static int[] insertionSort(int[] a, int n) {

		for (int i = 1; i < n; i++) {
			int temp = a[i];
			int j = i - 1;
			for(j=i-1;j>=0;j--) {
				if(a[j]>temp) {
					a[j+1]=a[j];
				}else {
					break;
				}
			}
			a[j+1]=temp;
		}
		return a;

	}

}








