package Strings;

public class MaximumOccrringCharacter {

	public static void main(String[] args) {
		String s = "madhumadumdd";
		char result = maxi(s);
		System.out.println(result);

	}

	private static char maxi(String str) {
		char ans = str.charAt(0);
		int i, curr_freq = 0, max_freq = 0, n = str.length();
		for (i = 1; i < n; i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				curr_freq++;
			} else {
				if (max_freq < curr_freq) {
					max_freq = curr_freq;
					ans = str.charAt(i - 1);
				}
				curr_freq = 0;
			}
		}
		if (max_freq < curr_freq) {
			max_freq = curr_freq;
			ans = str.charAt(i - 1);
		}
		return ans;

	}
}
