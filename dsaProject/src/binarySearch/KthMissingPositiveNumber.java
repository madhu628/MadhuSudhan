package binarySearch;

public class KthMissingPositiveNumber {
	
	public static void main(String[] args) {
		 int[] vec = {4, 7, 9, 10};
	        int n = 4, k = 4;
	        int ans = missingK(vec, n, k);
	        int ans1 = missingK1(vec, n, k);
	        System.out.println("The missing number is: " + ans);
	        System.out.println("The missing number is: " + ans1);
	}
	
	//brute force 
	public static int missingK(int[] vec, int n, int k) {
        for (int i = 0; i < n; i++) {
            if (vec[i] <= k) k++; //shifting k
            else break;
        }
        return k;
    }
	
	//optimal
	 public static int missingK1(int[] vec, int n, int k) {
	        int low = 0, high = n - 1;
	        while (low <= high) {
	            int mid = (low + high) / 2;
	            int missing = vec[mid] - (mid + 1);
	            if (missing < k) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        return k + high + 1;
	    }

}
