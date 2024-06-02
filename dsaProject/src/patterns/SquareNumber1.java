package patterns;

//i same 

//1111
//2222
//3333
//4444

public class SquareNumber1 {

//	public static void main(String[] args) {
//		int i = 1, n = 4;
//		while (i <= n) {
//			int j = 1;
//			while (j <= n) {
//				System.out.print(i);
//				j = j + 1;
//			}
//			System.out.println();
//			i = i + 1;
//		}
//	}

	// j same
//	1234
//	1234
//	1234
//	1234
//	public static void main(String[] args) {
//		int i = 1, n = 4;
//		while (i <= n) {
//			int j = 1;
//			while (j <= n) {
//				System.out.print(j);
//				j = j + 1;
//			}
//			System.out.println();
//			i = i + 1;
//		}
//	}

//	4321
//	4321
//	4321
//	4321
//	j same -reverse
//	public static void main(String[] args) {
//		int i = 1, n = 4;
//		while (i <= n) {
//			int j = 1;
//			while (j <= n) {
//				System.out.print(n-j+1);
//				j = j + 1;
//			}
//			System.out.println();
//			i = i + 1;
//		}
//	}

//	1 2 3 4 
//	5 6 7 8 
//	9 10 11 12 
//	13 14 15 16 
//	i and j both are not same
	public static void main(String[] args) {
		int i = 1, n = 4, count = 1;
		while (i <= n) {
			int j = 1;
			while (j <= n) {
				System.out.print(count + " ");
				count++;
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

}
