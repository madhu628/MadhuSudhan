package patterns;

//1
//22
//333
//4444
//i same 

public class TriangleNumbers {

//	public static void main(String[] args) {
//		int i = 1, n = 4;
//		while (i <= n) {
//			int j = 1;
//			while (j <= i) {
//				System.out.print(i);
//				j = j + 1;
//			}
//			System.out.println();
//			i = i + 1;
//		}
//
//	}

//	1
//	12
//	123
//	1234
//	j same 
//	public static void main(String[] args) {
//		int i = 1, n = 4;
//		while (i <= n) {
//			int j = 1;
//			while (j <= i) {
//				System.out.print(j);
//				j = j + 1;
//			}
//			System.out.println();
//			i = i + 1;
//		}
//
//	}
//	1
//	23
//	456
//	78910
//    i and j both are not same
//	public static void main(String[] args) {
//		int i = 1, n = 4, count = 1;
//		while (i <= n) {
//			int j = 1;
//			while (j <= i) {
//				System.out.print(count);
//				count++;
//				j = j + 1;
//			}
//			System.out.println();
//			i = i + 1;
//		}
//
//	}

//	1
//	21
//	321
//	4321
//	i and j both are not same
	public static void main(String[] args) {
		int i = 1, n = 4;
		while (i <= n) {
			int j = 1;
			while (j <= i) {
				System.out.print(i - j + 1);
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}

	}

}
