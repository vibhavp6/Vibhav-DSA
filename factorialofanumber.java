public class factorialofanumber {
    public static int factorial (int n) {
        int f  = 1;
        for (int i = 1; i <=n; i ++ ) {
            f = f *i;
            //System.out.println(f);

        }
        return f;

    }





    public static void main(String[] args) {
    //   factorial(4);
        System.out.println(factorial(4));
    }
}
