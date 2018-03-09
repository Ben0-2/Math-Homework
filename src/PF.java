import java.util.ArrayList;

public class PF {
	int n;
	private ArrayList<Integer> primes;
	private ArrayList<Integer> powers;
	private ArrayList<Boolean> primeornot;

	public PF(int k) {
		n = k;
		buildPrimes(k);
		createPowerList(k);
	}

	private void buildPrimes(int k) {
		// FINISH STUF
		for (int n = 0; n < k; n++) {
			primeornot.set(n, false);
		}
		for (int i = 1; i <= k; i++) {
			boolean primechecker = false;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					primechecker = true;
				}
			}
			if (!primechecker) {
				primeornot.set(i, true);
				for (int m = i + 1; m < k; m++) {
					if (m % i == 0) {
						primeornot.set(m, false);
					}
				}
			}

		}
	}

	public ArrayList<Integer> createPowerList(int k) {
		for (int l = 0; l < k; l++) 
			powers.set(l, 0);
		for (boolean b : primeornot) {
			if (b) {
				k = k / primeornot.indexOf(b);
				powers.set(primeornot.indexOf(b), 1);
				if (k > 1) {
					for (int i = 1; i < k; i++) {
						if (k % primeornot.indexOf(b) == 0) {
							for (int n = 1; n < (k + k % 2) / 2; n++)
								if (powers.get(primeornot.indexOf(b)) == n) 
                               powers.set(primeornot.indexOf(b), n + 1);
								
						}
					}
				}
			}

		}
		return powers;

	}
}
