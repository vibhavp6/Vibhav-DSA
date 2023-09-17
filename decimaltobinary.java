public class decimaltobinary {
    public static int dectobinary(int n) {
        int power = 0;
        int binnum = 0;

        while (n>0) {
            int lastDigit = n%2;
            binnum = binnum + (lastDigit * (int) Math.pow(10,power));
            power ++;
            n = n /2;


        }
        System.out.println(binnum);
        return binnum;

    }



    public static void main(String[] args) {
      //  System.out.println(dectobinary(5 ));
        dectobinary(5);

    }
}
