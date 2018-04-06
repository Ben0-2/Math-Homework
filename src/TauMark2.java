import java.util.ArrayList;

public class TauMark2 {
public static void main(String[] args) {
	for(int m = 2; m<10000; m++) {
	PF pf = new PF(m);
	int j = 1;

	for(int i=0; i<pf.getPowers().size(); i++) {
		j*= ((int) Math.pow(pf.getPrimes().get(i), pf.getPowers().get(i)+1)-1)/(pf.getPrimes().get(i)-1);
	}
	System.out.println(m+ " | " + j);
	}
	}
}
