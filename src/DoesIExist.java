import java.util.ArrayList;

public class DoesIExist {
public DoesIExist(int n) {
makeZ(n);
System.out.println(verifyExistence(n));
}
public static void main(String[] args) {
	PF p = new PF(1000);
	
	for(int i = 1; i<1000; i++) {
		if(PF.getPrimeornot().get(i)) {
			DoesIExist d = new DoesIExist(i);
			
		}
	}
}
	public ArrayList<Integer> makeZ(int i){
		ArrayList<Integer> list = new ArrayList<>();
		for(int j = 0; j<i; j++) {
			list.add(j);
		}
		return list;
		
	}
boolean verifyExistence(int i) {
	for(int j= 1; j<=Math.sqrt(i); j++) {
		if(j*j == i-1) {
			return true;
		}
	}
	return false;
	
}
}
