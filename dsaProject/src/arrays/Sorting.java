package arrays;

public class Sorting {
//	public static void main(String[] args) {
//		int a[] = { 3, 8, 0, 4, 2, 7, 3 };
//		int n = a.length;
//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < n; j++) {
//				if (a[i] > a[j]) {
//					int temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(a));
////		for (int i = 0; i < n; i++) {
////
////			System.out.println(a[i]);
////		}
//	}

	public static void main(String[] args) {
		int[] a = { 1, 6, 2, 99, 22 };

		// Arrays.stream(a).sorted().forEach(n -> System.out.println(n));

//		int temp;
		int[] result = sortFunction(a);

		for (int k = 0; k < result.length; k++) {
			System.out.print(result[k] + "\t");
		}
	}

	public static int[] sortFunction(int[] a) {
		int temp = 0;
		int n = a.length - 1;
		int[] sortedArray = new int[a.length];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (int k = 0; k < a.length; k++) {
//			System.out.print(val[k]+"\t");
			sortedArray[k] = a[k];
		}

		return sortedArray;
	}

}