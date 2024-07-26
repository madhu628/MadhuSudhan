package arrays2;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		int r = 5; // row number
		int c = 3; // col number
		int element = pascalTriangle(r, c);
		int element1 = pascalTriangle(r, c);
		int element2 = pascalTriangle(r, c);
		
		System.out.println("The element at position (r,c) is: " + element);
		System.out.println("The element at position (r,c) is: " + element1);
		System.out.println("The element at position (r,c) is: " + element2);
	}

	//bruteforce approach
	public static long nCr(int n, int r) {
		long res = 1;

		// calculating nCr:
		for (int i = 0; i < r; i++) {
			res = res * (n - i);
			res = res / (i + 1);
		}
		return res;
	}

	public static int pascalTriangle(int r, int c) {
		int element = (int) nCr(r - 1, c - 1);
		return element;
	}

	//better approach
	public static long nCr1(int n, int r) {
		long res = 1;

		// calculating nCr:
		for (int i = 0; i < r; i++) {
			res = res * (n - i);
			res = res / (i + 1);
		}
		return res;
	}

	public static void pascalTriangle1(int n) {
		// printing the entire row n:
		for (int c = 1; c <= n; c++) {
			System.out.print(nCr1(n - 1, c - 1) + " ");
		}
		System.out.println();
	}

	//optimal approach
	public static int nCr2(int n, int r) {
		long res = 1;
		// calculating nCr:
		for (int i = 0; i < r; i++) {
			res = res * (n - i);
			res = res / (i + 1);
		}
		return (int) res;
	}

	public static List<List<Integer>> pascalTriangle2(int n) {
		List<List<Integer>> ans = new ArrayList<>();

		// Store the entire Pascal's triangle:
		for (int row = 1; row <= n; row++) {
			List<Integer> tempLst = new ArrayList<>(); // temporary list
			for (int col = 1; col <= row; col++) {
				tempLst.add(nCr2(row - 1, col - 1));
			}
			ans.add(tempLst);
		}
		return ans;
	}

}
