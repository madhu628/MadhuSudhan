package searching;

public class BinarySearch {
	public static void main(String[] args) {
		
		int[] a = {2,4,6,8,12,18};
		int n = a.length;
		int index = binarySearch(a, n, 2);
		System.out.println(index);
	}

	private static int binarySearch(int a[],int n , int key) {
		int s=0 ,e=n-1;
		int mid=(s+e)/2;
		while(s<=e) {
			if(a[mid]==key) {
				return mid;
			}
			if(key>a[mid]) {
				s=mid+1;
			}else {
				e=mid-1;
			}
			mid = (s+e)/2;
		}
		return -1;
	}

}
