
public class ConjectureDisproof {
	public static void main(String[] args) {
		ConjectureDisproof thing = new ConjectureDisproof() ;
		thing.forLoopConjecture();
	}
	void forLoopConjecture() {
		for(int i=1000; i<10000; i++) {
			if(i%2 == 1&& !isPrime(i)) {
				for(int x = 0; x<i/2 +1/2; x++) {
					if(isSquare(x)) {
						for(int j = 0; j<i/2 + 1; j++) {
							if(isPrime(j)) {
								if((2*x + j) == i) {
									
									System.out.println(i);
								}
							}
						}
					}
				}
			}
		}
	}boolean isSquare(int a) {
		if(a==1) {
			return true;
		}
		else {
		for(int i=0;i<a;  i++) {
			if(a==i*i) {
				return true;
			}
		}
		}

		return false;
		
	}
	boolean isPrime(int a) {
		for(int i=2; i<a; i++) {
			if(a%i == 0) {
				boolean b = false;
				return b;
				
			}
			

		}
		return true;





		}
}
