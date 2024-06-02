package arrays;

import java.util.Arrays;

public class DeleteElement {
//	public static void main(String[] args) {
//		int[] a = { 1, 4, 5, 3, 2, 6 };
//		int n = a.length, e = 3;
//		for (int i = 0; i < n; i++) {
//			if (a[i] == e) {
//				for (int j = i; j < n - 1; j++) {
//					a[j] = a[j + 1];
//				}
//				break;
//			}
//		}
//		for (int i = 0; i < n-1; i++) {
//			System.out.println(a[i]+ " ");
//		}
//
//	}
//	public static void main(String[] args) {
//
//		int a1[] = { 1, 4, 5, 3, 2, 6 };
//		int[] a2 = new int[a1.length - 1];
//		int e = 3;
//
//		for (int i = 0, k = 0; i < a1.length; i++) {
//			if (i != e) {
//				a2[k] = a1[i];
//				k++;
//			}
//		}
//		System.out.println(Arrays.toString(a2));
//
//	}
	
	public static void main(String[] args) {
		int a[] = { 1, 4, 5, 3, 2, 6 };
		int n = a.length, e = 3;
		if(e>=n+1) {
			System.out.println("not possible");
		}else {
			for(int i=e-1;i<n-1;i++) {
				a[i]=a[i+1];
				
			}
		}
		for(int i=0;i<n-1;i++) {
			System.out.println(a[i]);
		}
	}
}
