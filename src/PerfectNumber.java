
public class PerfectNumber {
    public static void main(String[] args) {
        final int lastnum = 1000000000;
        int i;
        for(i = 2; i < lastnum; i++) { 
            if(i>=1000000 && i%1000000 == 0) {
            	System.out.println("You are at " + i + "!");
            }
            else if(perfectOrNot(i)) {
                System.out.println(i + " is perfect!");
            }
        }
    }
    public static boolean perfectOrNot(int i) {
        boolean isitperfect = false;
        int sum = 1;
        for(int j = 2; j <= (i+i%2) / 2; j++) {
            if(i % j == 0) {
                sum += j;
            }
        }
        if(sum == i) {
            isitperfect = true;
        }
        return isitperfect;
    }
}