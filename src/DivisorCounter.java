import java.util.ArrayList;

public class DivisorCounter extends PF{
public DivisorCounter(int k) {
		super(k);
	
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	int j = 2;
	int k = 5;
	DivisorCounter d = new DivisorCounter(k);
	for(int i: d.createPowerList(k)) {
		
		j+=i;
		}
System.out.println(j);
}

}
