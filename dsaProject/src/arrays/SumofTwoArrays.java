package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class SumofTwoArrays {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 6 };
		int n = a.length;
		int m = b.length;
		ArrayList<Integer> res = findArraySum(a, n, b, m);
		Collections.reverse(res);
		System.out.println(res);
	}

	private static ArrayList<Integer> findArraySum(int[] a, int n, int[] b, int m) {
		int i = n - 1, j = m - 1;
		int carry = 0;
		ArrayList<Integer> ans = new ArrayList<>();
//		while (i >= 0 && j >= 0) {
//			int val1 = a[i];
//			int val2 = b[j];
//			int sum = val1 + val2 + carry;
//			carry = sum / 10;
//			sum = sum % 10;
//			ans.add(sum);
//			i--;
//			j--;
//
//		}
//		while (i >= 0) {
//			int sum = a[i] + carry;
//			carry = sum / 10;
//			sum = sum % 10;
//			ans.add(sum);
//			i--;
//		}
//		while (j >= 0) {
//			int sum = b[i] + carry;
//			carry = sum / 10;
//			sum = sum % 10;
//			ans.add(sum);
//			j--;
//		}
//		while (carry != 0) {
//			int sum = carry;
//			carry = sum / 10;
//			sum = sum % 10;
//			ans.add(sum);
//		}
//		return ans;

		while (i >= 0 || j >= 0 || carry > 0) {
			int sum = carry;
			if (i >= 0)
				sum += a[i--];
			if (j >= 0)
				sum += b[j--];
			ans.add(sum % 10);
			carry = sum / 10;
		}
		return ans;
	}
}
