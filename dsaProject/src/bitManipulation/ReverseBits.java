package bitManipulation;

public class ReverseBits {

	public static void main(String[] args) {
		System.out.println(reverseBites(0b00000010100101000001111010011100));
	}

	private static int reverseBites(int n) {

		int result = 0;
		for (int i = 0; i < 32; i++) {
			result <<= 1;// Shift result left by 1 to make room for the next bit
			
			//The n & 1 operation extracts the least significant bit of n, which is then added to result using the bitwise OR operator (|).
			result |= (n & 1); // Add the least significant bit of n to result
			System.out.println(result);
			n >>= 1; // Shift n right by 1 to process the next bit

		}

		return result;

	}

}



//Time Complexity: O(1) because the loop runs a fixed number of times (32 times) regardless of the input.
//Space Complexity: O(1) because we only use a constant amount of additional space for the variables.
//



















