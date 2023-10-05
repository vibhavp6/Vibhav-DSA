package Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = factorials(n);
        System.out.println(f);
    }

    static int factorials(int n) {
        if (n == 0) {
            return 1;
        }
        int fac= factorials (n-1);
        int fn = n * fac;
        return fn;
    }
}
