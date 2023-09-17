import java.util.Scanner;
public class checkifanumberisprimeornot {
    public static boolean isPrime( int b) {
        if (b == 2) {
            return true;
        }
        for (int i = 2; i<=Math.sqrt(b); i++) {
            if (b%i==0) {
                return false ;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(9));
        isPrime(9);


    }
}
