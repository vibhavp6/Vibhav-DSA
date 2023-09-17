public class binarytodecimal {
    public static int binaytodec(int n) {

        int mynum = n;
        int power = 0;
        int decnum = 0;
        while (n>0 ) {
            int lastDigit = n%10;
            decnum = decnum + (lastDigit * (int)Math.pow(2,power));
            power ++;
            n = n/10;

        }

      //  System.out.println(mynum + " your num is " + decnum);


        return decnum;
    }




    public static void main(String[] args) {
       //  binaytodec(101);
        System.out.println(binaytodec(101));

    }
}
