package Recursion;

import java.util.Scanner;

public class firtsindexarrayofthatnumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter size");
        int a = sc.nextInt();
        int [] arr = new int [a];
        for (int i = 0 ; i<arr.length; i++) {
            System.out.println("enter numbers ");
            arr[i]= sc.nextInt();
        }
        System.out.println("enetr which no to find");
        int d = sc.nextInt();
        int f = firstindex(arr, 0,d) ;
        System.out.println(f);
    }

    static int firstindex(int [] arr , int idx , int d) {
        if ( idx == arr.length) {
            return -1;
        }
        if (arr[idx] == d) {
            return idx;
        }
        int fisa = firstindex(arr,idx+1,d) ;
        return fisa;
    }
}