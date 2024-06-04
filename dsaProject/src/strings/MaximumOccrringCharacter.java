package strings;

public class MaximumOccrringCharacter {

	public static void main(String[] args) {
		String s = "madhumadumdd";
		char result = maxi(s);
		System.out.println(result);

	}

	private static char maxi(String str) {
		
		if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string is null or empty");
        }
		
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
				curr_freq = 0; //reset to 0  for the new character
			}
		}
		// Final check at the end of the loop
		if (max_freq < curr_freq) {
			max_freq = curr_freq;
			ans = str.charAt(n - 1);
		}
		return ans;

	}
}
