import java.util.ArrayList;

public class Tau {
public static void main(String[] args) {
	Tau t = new Tau();
	System.out.println(t.Sum(33550336));
}
int Sum(int n){
	ArrayList<Integer> list = new ArrayList<>();
	int sum = 0;
	for(int i = 1; i<=(n+n%2)/2; i++) {
		if(n%i == 0) {
			sum+=i;
		}
	}
return sum;
}
}
