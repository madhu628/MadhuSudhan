package strings;

//to remove char "i" between 2 char to second last char

//input-iigii"  o/p= igi

public class RemoveCharInBtw {

	public static void main(String[] args) {

		String str = "iigii"; // Order By salary DESC Limit 1,1
		String output = "";

		for (int i = 0; i < str.length(); i++) {
			if (i != 0 && i != str.length() - 1) {
				if (!(str.charAt(i) == 'i')) {
					output = output + str.charAt(i);
				}
			} else {
				output = output + str.charAt(i);
			}

		}
		System.out.println(output);

	}

}
