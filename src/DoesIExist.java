import java.util.ArrayList;

public class DoesIExist {
	public DoesIExist(int n) {
		makeZ(n);
		System.out.println(n + " | " + verifyExistence(n));
	}

	public static void main(String[] args) {
	int n = 5010;
		PF p = new PF(n);

		for (int i = 1; i < n; i++) {
			if (PF.getPrimeornot().get(i)) {
				DoesIExist d = new DoesIExist(i);

			}
		}
	}

	public ArrayList<Integer> makeZ(int i) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int j = 0; j < i; j++) {
			list.add(j);
		}
		return list;

	}

	boolean verifyExistence(int i) {
		for (int j = 1; j <= i-1; j++) {

			if ((j * j) % i == i - 1) {
			System.out.println(j+ " is true for " + i + "!");
				return true;
			}

		}
		return false;

	}
}
