import java.util.ArrayList;
import java.util.Collections;

public class ThreeXPlusOneConjecture {
	static int end = 1000000;
	static ArrayList<Boolean> ConjectureTruthValue = new ArrayList<Boolean>(Collections.nCopies(end, false));

	public static void main(String[] args) {
		ThreeXPlusOneConjecture conjecture = new ThreeXPlusOneConjecture();
	
		for(int i=1; i<end; i++) {
	
			if(!ConjectureTruthValue.get(i)) {
				conjecture.turnListTrue(conjecture.makeList(i));
			}
		}
	conjecture.printBooleanIndices(false);
	}
void printBooleanIndices(boolean b) {
for(int i=0; i<ConjectureTruthValue.size(); i++) {
	if(ConjectureTruthValue.get(i) == b) {
		System.out.println(i);
	}
}
}
	ArrayList makeList(int m) {
		ArrayList<Integer> list = new ArrayList();
list.add(1);
		while (m != 1) {
			list.add(m);
			m = (m % 2 == 0) ? m / 2 : 3 * m + 1;
		}
		return list;
	}

	void turnListTrue(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			turnTrue(list.get(i));
		}
	}

	void turnTrue(int k) {
		for (int n = k; n < end; n *= 2) {
			if(!ConjectureTruthValue.get(n)) {
			ConjectureTruthValue.set(n, true);
			}
		}
	}
}
