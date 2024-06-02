package arrays;

public class BinarySorting {
	public static void main(String[] args) {
		int[] a = { 0, 1, 0, 1, 2 };
		int n = a.length;
		binarySorting(a, n);
		print(a,n);

	}

	private static void print(int[] a ,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+"  ");
		}
	}

	private static void binarySorting(int[] a, int n) {
		int low = 0, high = n - 1, mid = 0;
		while (mid <= high) {
			if (a[mid] == 0) {
				int temp = a[mid];
				a[mid] = a[low];
				a[low] = temp;
				mid++;
				low++;
			}
			if (a[mid] == 1) {
				mid++;
			}
			if (a[mid] == 2) {
				int temp = a[mid];
				a[mid] = a[high];
				a[high] = temp;
				high--;
			}
		}
	}

}
