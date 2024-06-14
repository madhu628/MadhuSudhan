package arrays;

public class GasStation {

	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int totalGas = 0;
		int totalCost = 0;
		int currentGas = 0;
		int startingIndex = 0;

		for (int i = 0; i < gas.length; i++) {
			totalGas += gas[i];
			totalCost += cost[i];
			currentGas += gas[i] - cost[i];

			// If currentGas is negative, reset the starting index to the next station
			if (currentGas < 0) {
				startingIndex = i + 1;
				currentGas = 0;
			}
		}

		// If total gas is less than total cost, return -1, otherwise return starting
		// index
		return totalGas > totalCost ? startingIndex : -1  ;
	}

	public static void main(String[] args) {
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };
		System.out.println(canCompleteCircuit(gas, cost)); // Output: 3
	}
}
