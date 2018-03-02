import java.util.ArrayList;

public class lcmofnums {
	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		lcmofnums trump = new lcmofnums();
		System.out.print(trump.gcd(12,3));
	}

	public int lcmofarray(ArrayList<Integer> list, int start, int end) {
		if ((end - start) == 1)
			return lcm(list.get(start), list.get(end - 1));
		else
			return (lcm(list.get(start), lcmofarray(list, start + 1, end)));
	}

	public int gcd(int a, int b) {
		if (a < b)
			return gcd(b, a);
		if (a % b == 0)
			return b;
		else
			return gcd(a, a % b);
	}

	public int lcm(int a, int b) {
		return ((a * b) / gcd(a, b));

	}
}
