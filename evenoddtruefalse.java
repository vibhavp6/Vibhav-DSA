package homework;

public class evenoddtruefalse {
    public static Boolean isPrime (int a) {
        if ( a <=1 ) {
            return false;
        }
        for (int i = 2; i<=a; i++ ) {
            if (a%2 ==0 ) {
                return true;
            }
        }
        return false;

    }








    public static void main(String[] args) {
        System.out.println(isPrime(4));

    }
}
