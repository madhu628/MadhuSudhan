//float part of square root
package binarySearch;

public class FloatSquareRoot {
	public static void main(String[] args) {
		int n=37;
		int sol = sq(n);
		double d = floatSq(n,3,sol);
		System.out.println(d);
	}

	private static double floatSq(int n, int precision, int sol) {
		double factor =1,ans=sol;
		for(int i=0;i<precision;i++) {
			factor = factor/10;
			for(double j=ans;j = j*j<n;j=j+factor) {
				ans =j;
			}
		}
		return ans;
	}

	private static int sq(int n) { 
		
		return 0;
	}
	

}
