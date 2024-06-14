//merge two sorted arrays
package arrays;

import java.util.Arrays;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 9}; //// Extend the array to fit the merged result
		int[] b = { 2, 4, 6, 7, 9 };
		int n = 5, m = b.length;
		  int[] c = new int[m+n];
		merge(a, n, b, m, c);
		System.out.println(Arrays.toString(c));
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n , int[] c) {
      
        int i=0 ,j=0,k=0;
        while(i< m && j < n){
            if(nums1[i] < nums2[j]){
                c[k++] = nums1[i++];
            }else{
                c[k++] = nums2[j++];
            }
        }
        while(i<m){
            c[k++] = nums1[i++];
        }
        while(j<n){
            c[k++] = nums2[j++];
        }

        // Copy merged elements from c back into nums1
//        for (int l = 0; l < m + n; l++) {
//            nums1[l] = c[l];
//        }
    }
}

//	public static void merge(int[] nums1, int m, int[] nums2, int n) {
//		// Start merging from the end of nums1 and nums2
//		int i = m - 1; // Pointer for nums1's last valid element
//		int j = n - 1; // Pointer for nums2's last element
//		int k = m + n - 1; // Pointer for nums1's last position
//
//		// Merge nums1 and nums2 from the end to the start
//		while (i >= 0 && j >= 0) {
//			if (nums1[i] > nums2[j]) {
//				nums1[k--] = nums1[i--];
//			} else {
//				nums1[k--] = nums2[j--];
//			}
//		}
//
//		// Copy any remaining elements of nums2 into nums1
//		while (j >= 0) {
//			nums1[k--] = nums2[j--];
//		}
//
//		// No need to copy remaining elements of nums1 because they are already in place
//	}
//}
