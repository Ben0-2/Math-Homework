import java.util.ArrayList;

class Bob{
	public static void main(String[] args) {
		Bob b = new Bob();
		ArrayList<Integer> bob = new ArrayList<>();
		b.method(bob);
		System.out.println(bob);
	}
	void method(ArrayList<Integer> list) {
	list.add(171);
	}
}
