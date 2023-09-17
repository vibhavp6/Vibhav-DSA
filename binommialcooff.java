public class binommialcooff {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <=n; i++) {
            f*=i;
        }
        return f;

    }

    public static int binomial (int n , int r) {
         int factn = factorial (n);
         int factr = factorial(r);
         int factnmr = factorial(n-r);
         int binomial = factn/ (factr*factnmr);
         return binomial;


    }

    public static void main(String[] args) {
        System.out.println(binomial(5,2));
    }

    }












    //public static void main(String[] args) {

    //}

//}
