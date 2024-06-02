package binarySearch;

public class SquareRoot {
	
	public static void main(String[] args) {
//		int n =25;
//		System.out.println(squareroot(n));
	}

	private static int squareroot(int n) {
		int s = 0, e = n - 1;
		int mid = s + (e - s) / 2, ans = -1;
		while (s <= e) {
			int sq= mid*mid;
			if(sq==n) {
				return mid;
			}
			if(sq<n) {
				ans=mid;
				s=mid+1;
			}else {
				e=mid-1;
			}
			mid = s + (e - s) / 2;
		}
		return ans;
	}
}
