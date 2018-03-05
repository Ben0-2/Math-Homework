import java.util.ArrayList;

public class lcmofnums {
	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		lcmofnums trmp = new lcmofnums();

		double j = 0;
		int end = 100000;
		for (int n = 1; n < 100; n++) {
			for (int i = 1; i < end; i++) {
				j += trmp.gcd(n, i);
			}
			System.out.println(n + "|" + j / end);
		j = 0;
		}
	}

	public int gcd(int a, int b) {

		int min = (a < b) ? a : b;
		int max = (a > b) ? a : b;
		if (max % min == 0)
			// return min;
			return 1;

		else
			return gcd(min, max % min) + 1;

	}

	public int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
}