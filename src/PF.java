import java.util.ArrayList;

public class PF {
	int n;
	ArrayList<Integer> primes = new ArrayList<>();
	ArrayList<Integer> powers = new ArrayList<>();
	static ArrayList<Boolean> primeornot = new ArrayList<>();

	public PF(int k) {
		n = k;
		buildPrimes();
		buildPrimeDivisors();
		createPowerList();
	}

	private void buildPrimeDivisors() {
		// TODO Auto-generated method stub
		for (int i = 2; i <= n; i++) {
			if (primeornot.get(i)) {
				if (n % i == 0) {
					primes.add(i);
				}
			}
		}
	}

	public ArrayList<Integer> getPrimes() {
		return primes;
	}

	void buildPrimes() {
		for (int a = 0; a <= n; a++) {
			primeornot.add(true);
		}
		primeornot.set(0, false);
		primeornot.set(1, false);
		for (int i = 2; i <= n; i++) {
			if (primeornot.get(i)) {
				for (int j = i * 2; j <= n; j += i) {
					primeornot.set(j, false);
				}
			}
		}
	}

	public static ArrayList<Boolean> getPrimeornot() {
		return primeornot;
	}

	public void createPowerList() {
		for (int i : primes) {
	
			int powernum = 2;
			
			while (n % (Math.pow(i, powernum)) == 0) {
				powernum += 1;

			}
			powers.add(powernum-1);
		}
	}

	public ArrayList<Integer> getPowers() {
		return powers;
	}
}
