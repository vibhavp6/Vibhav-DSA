public class printallprimesinarange {
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

    public static void primeisinrange (int b) {
        for (int i = 2; i <=b; i++) {
            if (isPrime((i))) {
                System.out.println(i);
            }
        }
        System.out.println();


    }

    public static void main(String[] args) {
        System.out.println(isPrime(4));


    }

}



