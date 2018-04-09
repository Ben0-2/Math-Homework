import java.util.ArrayList;

public class IDKwhattocallthis {
	public IDKwhattocallthis(int i) {
		ArrayList<Boolean> list = new ArrayList<>();
		for (int j = 0; j <= i; j++) {
			list.add(false);
			for (int k = 0; k <= Math.sqrt(i); k++) {
				for (int p = 0; p <= Math.sqrt(i); p++) {
					if (j == k * k + p * p) {
						System.out.println(j);
						list.set(j, true);
					}
				}
			}
		}

		System.out.println(list);

	}

	public static void main(String[] args) {
		int j = 40;
		IDKwhattocallthis i = new IDKwhattocallthis(j);
		i.MakeSingerAlgorithmList(j);

	}

	void MakeSingerAlgorithmList(int i) {
		ArrayList<Boolean> list = new ArrayList<>();
		PF p = new PF(i);
		for (int l = 0; l <= i; l++) {
			list.add(false);
		}
		list.set(0, true);
		list.set(1, true);
		list.set(2, true);
	

		 for(int b = 0; b<=i; b++) {
		 if (p.getPrimeornot().get(b) && b % 4 == 1) {
		 list.set(b, true);
		 System.out.println(b);
		 }
		
		
		 for (int a = 0; a <= Math.sqrt(b); a++) {
		 if (a * a == b)
		 list.set(b, true);
		 System.out.println(b);
		 }
		}
			findTrueIndices(list); 
		//
		// System.out.println(list);
		//// for (int n = 0; n <= 3; n++) {
		//// for (int j = 2; j < list.size(); j++) {
		//// int k = j * (list.get(list.indexOf(j) + 1));
		//// if (k <= i) {
		//// list.add(k);
		//// }
		//// }
		//// }

	}

	void findTrueIndices(ArrayList<Boolean> list) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)) {
				System.out.print(i + " ");
			}
		}

	}
	
}
