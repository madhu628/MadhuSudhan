package maths;

public class SieveOfEratothesis {

	public static void main(String[] args) {

		int n = 20;
		int count = countPrimes(n);
		System.out.println(count);
	}

	private static int countPrimes(int n) {
		if (n <= 1) {
			return 0;
		}
		boolean isPrime[] = new boolean[n + 1];
		for (int i = 2; i <= n; i++) {
			isPrime[i] = true;
		}
		for (int p = 2; p * p <= n; p++) {
			if (isPrime[p]) {
				for (int multiple = p * p; multiple <= n; multiple += p) {
					isPrime[multiple] = false;
				}
			}
		}
		int primeCount = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				primeCount++;
			}
		}

		return primeCount;
	}

}
