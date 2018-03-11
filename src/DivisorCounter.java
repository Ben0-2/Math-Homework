import java.util.ArrayList;

public class DivisorCounter {

	public static void main(String[] args) {
		PF pf = new PF((int) Math.pow(2, 15));
		int k = 1;
		for (int i : pf.getPowers()) {
			k = k * (i + 1);
		}
		System.out.println(k + " is your divisor count!");
	}

}
