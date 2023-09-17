import java.util.Scanner;
public class checkprimefunction {
    public static void main(String[] args) {
        boolean vib = isPrime();
        System.out.println(vib ? "prime" : "not prime" );
    }
    static boolean isPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();
        if (n==2) {
            return true;
        }

        for (int i = 2; i<=Math.sqrt(n); i++) {
            if (n%i==0) {
                return false ;
            }

        }
        return true;
    }
}
