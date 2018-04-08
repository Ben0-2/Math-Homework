import java.util.ArrayList;

public class IDKwhattocallthis {
public IDKwhattocallthis(int i) {
	ArrayList<Integer> list = new ArrayList<>();
	for(int j = 0; j<=Math.sqrt(i)/2; j++) {
		for(int k = 0; k<=Math.sqrt(i)/2; k++) {
			list.add(j*j + k*k);
		}
	}
System.out.println(list);
}
	public static void main(String[] args) {
	int j = 40;
		IDKwhattocallthis i = new IDKwhattocallthis(j);
	System.out.println(MakeSquareList(j));
}
static ArrayList<Integer> MakeSquareList(int i){
	ArrayList<Integer> list = new ArrayList<>();
	list.add(0);
	list.add(1);
	list.add(2);
	list.add(4);
	list.add(5);
	list.add(8);
	list.add(9);
	for(int j: list) {
		int k = j*(list.get(list.indexOf(j) + 1));
		if(k<=i) {
			list.add(k);
		}
	}
	return list;
}
}
