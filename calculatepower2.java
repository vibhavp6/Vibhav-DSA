package Recursion;

import java.util.Scanner;

public class calculatepower2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int n = sc.nextInt();
        int sm = power(x,n);
        System.out.println(sm);
    }

    static int power(int x , int n) {
        if (n == 0) {
            return 1;
        }
        int sx = power(x, n/2) ;
        int xn = sx * sx;

        if(n % 2 != 0) {
            xn = xn *x;
        }
        return xn;
    }
}
