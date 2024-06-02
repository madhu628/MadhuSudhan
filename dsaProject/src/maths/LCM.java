package maths;

public class LCM {
	public static void main(String[] args) {

		int a = 6, b = 8;
		int min = a > b ? a : b;

		while (true) {
			if (min % a == 0 && min % b == 0) {
				System.out.println(min);
				break;
			}
			min++;
		}
	}

}
