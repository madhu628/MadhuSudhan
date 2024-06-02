//merge two sorted arrays
package arrays;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int[] a = {1,3,5,7,9};
		int[] b = {2,4,6};
		int[] c = new int[a.length + b.length];
		int n =a.length,m=b.length;
		merge(a,n,b,m,c);
		print(c,n+m);
	}

	private static void print(int[] c, int n) {
		for(int i=0;i<n;i++) {
			System.out.println(c[i]);
		}
	}

	private static void merge(int[] a, int n, int[] b, int m, int[] c) {
		int i=0,j=0,k=0;
		while(i<n && j<m) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				k++;
				i++;
			}else {
				c[k]=b[j];
				k++;
				j++;
			}
		}
		while (i < n) {
            c[k] = a[i];
            k++;
            i++;
        }
		while (j < m) {
            c[k] = b[j];
            k++;
            j++;
        }
		
	}

}
