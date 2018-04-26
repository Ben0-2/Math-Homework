import java.util.ArrayList;

public class BSArrayList<E> extends ArrayList<E> {

	void RemoveDuplicates() {
		for (int i = 0; i < size(); i++) {
			for (int j = i + 1; j < size(); j++) {
				if (get(i).equals(get(j))) {
					remove(j);
					j -= 1;

				}
			}
		}
	}
}
