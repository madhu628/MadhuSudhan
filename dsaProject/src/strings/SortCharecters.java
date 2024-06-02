package Strings;

public class SortCharecters {
	public static void main(String[] args) {
		String s= "java";
		char temp;
		char[] a = s.toCharArray();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a);
	}

}
