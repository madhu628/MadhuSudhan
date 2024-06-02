package patterns;

//A
//BB
//CCC
//DDDD
//i same
public class TriangleAlpha {

//	public static void main(String[] args) {
//		int i = 1, n = 4;
//		while (i <= n) {
//			int j = 1;
//			while (j <= i) {
//				char ch = (char) ('A' + i - 1);
//				System.out.print(ch);
//				j = j + 1;
//			}
//			System.out.println();
//			i = i + 1;
//		}
//	}

//	A
//	AB
//	ABC
//	ABCD
//	j same
//	public static void main(String[] args) {
//		int i = 1, n = 4;
//		while (i <= n) {
//			int j = 1;
//			while (j <= i) {
//				char ch = (char) ('A' + j - 1);
//				System.out.print(ch);
//				j = j + 1;
//			}
//			System.out.println();
//			i = i + 1;
//		}
//	}

//	A
//	BC
//	DEF
//	GHIJ
//	i and j both are not same
//	public static void main(String[] args) {
//		int i = 1, n = 4;
//		char value = 'A';
//		while (i <= n) {
//			int j = 1;
//			while (j <= i) {
//				System.out.print(value);
//				value++;
//				j = j + 1;
//			}
//			System.out.println();
//			i = i + 1;
//		}
//	}

//	A
//	BC
//	CDE
//	DEFG
//	i and j both are not same
//	public static void main(String[] args) {
//		int i = 1, n = 4;
//		while (i <= n) {
//			int j = 1;
//			while (j <= i) {
//				char ch = (char) ('A' + i + j - 2);
//				System.out.print(ch);
//				j = j + 1;
//			}
//			System.out.println();
//			i = i + 1;
//		}
//	}

	public static void main(String[] args) {
		int i = 1, n = 4;
		while (i <= n) {
			int j = 1;
			char start = (char) ('A' + n - i);
			while (j <= i) {
				System.out.print(start);
				start++;
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

}
