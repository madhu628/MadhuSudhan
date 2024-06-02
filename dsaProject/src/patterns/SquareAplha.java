package patterns;

//AAAA
//BBBB
//CCCC
//DDDD
//i same 
public class SquareAplha {
//	public static void main(String[] args) {
//		int i = 1, n = 4;
//		while (i <= n) {
//			int j = 1;
//			while (j <= n) {
//				char ch = (char) ('A' + i - 1);
//				System.out.print(ch);
//				j = j + 1;
//			}
//			System.out.println();
//			i = i + 1;
//		}
//	}

//	ABCD
//	ABCD
//	ABCD
//	ABCD
//	j same
//	public static void main(String[] args) {
//		int i = 1, n = 4;
//		while (i <= n) {
//			int j = 1;
//			while (j <= n) {
//				char ch = (char) ('A' + j - 1);
//				System.out.print(ch);
//				j = j + 1;
//			}
//			System.out.println();
//			i = i + 1;
//		}
//	}

//	ABCD
//	EFGH
//	IJKL
//	MNOP
//	i and j both are not same
//	public static void main(String[] args) {
//		int i = 1, n = 4;
//		char value = 'A';
//		while (i <= n) {
//			int j = 1;
//			while (j <= n) {
//				System.out.print(value);
//				value++;
//				j = j + 1;
//			}
//			System.out.println();
//			i = i + 1;
//		}
//	}

//	ABCD
//	BCDE
//	CDEF
//	DEFG
//	i and j both are not same
	public static void main(String[] args) {
		int i = 1, n = 4;
		while (i <= n) {
			int j = 1;
			while (j <= n) {
				char ch = (char) ('A' + i + j - 2);
				System.out.print(ch);
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

}
