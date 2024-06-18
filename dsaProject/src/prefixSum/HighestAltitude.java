package prefixSum;

public class HighestAltitude {

	public static void main(String[] args) {
		int[] gain = { -5, 1, 5, 0, -7 };
		int highestAltitude = findHighestAltitude(gain);
		System.out.println("Highest Altitude: " + highestAltitude); // Expected output: 1
	}

	private static int findHighestAltitude(int[] gain) {

		int currentAltitude = 0;
		int highestAltitude = 0; // Initial altitude is considered as 0

		for (int g : gain) {
			currentAltitude += g; // Update current altitude
			highestAltitude = Math.max(highestAltitude, currentAltitude); // Track the maximum altitude
		}

		return highestAltitude;
	}
}
