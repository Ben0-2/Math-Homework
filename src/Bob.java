
class Bob{
	public static void main(String[] args) {
		Bob b = new Bob();
		int bob = 4;
		b.method(bob);
		System.out.println(bob);
	}
	void method(int i) {
		i = i+1;
	}
}
