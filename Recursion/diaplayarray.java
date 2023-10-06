package Recursion;

import java.util.Scanner;

public class diaplayarray {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int [a];
        for (int i = 0 ; i<arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        display(arr, 0);
    }

    static void display(int [] arr , int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        display(arr,idx +1);
    }
}
