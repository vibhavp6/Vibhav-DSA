package Recursion;

import java.util.Scanner;

public class printzizag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pizz(n);
    }

    static void pizz(int n) {
        if ( n == 0) {
            return;
        }
        System.out.println("pre" + n);
        pizz(n-1);
        System.out.println("in" + n);
        pizz(n-1);
        System.out.println("post" + n);
    }
}
