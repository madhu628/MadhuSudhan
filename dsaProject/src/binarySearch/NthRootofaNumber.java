package binarySearch;

public class NthRootofaNumber {

	public static void main(String[] args) {
		int n = 3, m = 27;
		int ans = NthRoot(n, m);
		int ans1 = NthRoot1(n, m);
		System.out.println("The answer is: " + ans);
		System.out.println("The answer is: " + ans1);
	}

	//brute force
	// Power exponential method:
	public static long func(int b, int exp) {
		long ans = 1;
		long base = b;
		while (exp > 0) {
			if (exp % 2 == 1) {
				exp--;
				ans = ans * base;
			} else {
				exp /= 2;
				base = base * base;
			}
		}
		return ans;
	}

	public static int NthRoot(int n, int m) {
		// Use linear search on the answer space:
		for (int i = 1; i <= m; i++) {
			long val = func(i, n);
			if (val == (long) m)
				return i;
			else if (val > (long) m)
				break;
		}
		return -1;
	}
	
	 //Return 1 if mid == m
    //Return 0 if mid < m
    //Return 2 if mid > m
    public static int func(int mid, int n, int m) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m) return 2;
        }
        if (ans == m) return 1;
        return 0;
    }

    public static int NthRoot1(int n, int m) {
        // Use binary search on the answer space:
        int low = 1, high = m;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midN = func(mid, n, m);
            if (midN == 1) {
                return mid;
            } else if (midN == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
