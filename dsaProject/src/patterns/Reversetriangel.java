package patterns;

public class Reversetriangel {

//	   *
//	   **
//	  ***
//	 ****

//	public static void main(String[] args) {
//
//		int i = 1, n = 4;
//		while (i <= n) {
//			int space = n - i;
//			while (space != 0) {
//				System.out.printf(" ");
//				space--;
//			}
//			int j = 1;
//			while (j <= i) {
//				System.out.printf("*");
//				j++;
//			}
//			System.out.println();
//			i = i + 1;
//		}
//
//	}

//	public static void main(String[] args) {
//
//		int i = 1, n = 4;
//		while (i <= n) {
//			int space = i-1;
//			while (space != 0) {
//				System.out.printf(" ");
//				space--;
//			}
//			int j = 1;
//			while (j <= i) {
//				System.out.printf("*");
//				j++;
//			}
//			System.out.println();
//			i = i + 1;
//		}
//
//	}
	public static void main(String[] args) {

		int i = 1, n = 4;
		while (i <= n) {
			int space = n - i;
			while (space != 0) {
				System.out.printf(" ");
				space--;
			}
			int j = 1;
			while (j <= i) {
				System.out.print(j);
				j++;
			}
			int start = i - 1;
			while (start != 0) {
				System.out.print(start);
				start--;
			}
			System.out.println();
			i = i + 1;
		}

	}

}
