import java.util.ArrayList;
import java.util.Collections;

public class OddNumberThingy {
	public static void main(String[] args) {
		int n = 1000000;
		OddNumberThingy o = new OddNumberThingy();
		o.IHwin(n);
	}

	void IHwin(int i) {
		PF pf = new PF(i);
		ArrayList<Integer> list = findIndexesOfBooleanIndices(pf.getPrimeornot(), true);
		BSArrayList<Integer> listdos = new BSArrayList<>();
		list.remove(0);
		System.out.println(list);
		for (int m : list) {
			for (int n : list) {
				if (m + 2 * n <= i) {
					listdos.add(m + 2 * n);
				}
			}
		}
		Collections.sort(listdos);
		System.out.println(listdos);
		listdos.RemoveDuplicates();
		Collections.sort(listdos);
		System.out.println(listdos);
	}

	ArrayList<Integer> findIndexesOfBooleanIndices(ArrayList<Boolean> list, boolean b) {
		ArrayList<Integer> listdos = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) == b) {
				listdos.add(i);
			}
		}
		return listdos;
	}
}
