import java.util.ArrayList;

public class ConjectureDisproof {
	public static void main(String[] args) {
		ConjectureDisproof thing = new ConjectureDisproof();
		thing.forLoopConjecture();
		
	}

	void forLoopConjecture() {
		ArrayList<Integer> squareList = new ArrayList<>();
		ArrayList<Boolean> primeList = new ArrayList<>();
		for (int i = 0; i < 10000; i++) {
			if (isSquare(i)) {
				squareList.add(i);
				
			}
			primeList.add(isPrime(i));

		}
		System.out.println(squareList);
		System.out.println(primeList);
		for (int j = 1001; j < 10000; j += 2) {
			boolean foundSum = false;
			for (int k : squareList) {
				if (k < j) {
					int p = j - k;
					if (primeList.get(p)) {
						foundSum = true;
					}
				}

			}
			if (!foundSum) {
				System.out.println(j);
			}
		}
	}

	boolean isSquare(int a) {
		if (a == 2) {
			return true;
		}

		else {
			for (int i = 0; i < a / 2; i++) {
				if (a == 2 * i * i) {
					return true;
				}
			}
		}

		return false;

	}

	boolean isPrime(int a) {
		if (a == 0 || a == 1) {
			return false;
		} else {
			for (int i = 2; i < a; i++) {
				if (a % i == 0) {
					boolean b = false;
					return b;

				}

			}
		}
		return true;

	}
}
