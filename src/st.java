
public class st {
	public static void main(String[] args) {
		for(int i=1000; i<10000; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	static boolean isPrime(int a) {
		for(int i=2; i<a; i++) {
			if(a%i == 0) {
				boolean b = false;
				return b;
				
			}
			

		}
		return true;





		}
}
