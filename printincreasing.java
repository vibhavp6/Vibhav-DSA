package Recursion;

import java.util.Scanner;

public class printincreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printincreasings(n);
    }
    static void printincreasings(int n) {
        if (n == 0) {
            return;
        }

        printincreasings(n-1);
        System.out.println(n);
    }
}
