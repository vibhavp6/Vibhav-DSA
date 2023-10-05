package Recursion;

import java.util.Scanner;

public class calculatepower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int sm = power(x,n);
        System.out.println(sm);
    }

    static int power(int x , int n) {
        if (n == 0) {
            return 1;
        }
        int sx = power(x, n -1) ;
        int xn = x * sx;
        return xn;
    }
}
