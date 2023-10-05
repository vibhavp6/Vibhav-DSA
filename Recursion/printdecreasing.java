package Recursion;

import java.util.Scanner;

public class printdecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printdecreasings(n);
    }

    static void printdecreasings(int n) {
        if (n == 0 ) {
            return ;
        }
        System.out.println(n);
        printdecreasings(n-1);
    }
}
