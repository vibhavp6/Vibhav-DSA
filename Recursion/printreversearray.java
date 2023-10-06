package Recursion;

import java.util.Scanner;

public class printreversearray {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int [a];
        for (int i = 0 ; i<arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        displayreverse(arr, 0);
    }

    static void displayreverse(int []arr , int idx) {
        if (idx  == arr.length) {
            return;
        }
        displayreverse(arr,idx +1) ;
        System.out.println(arr[idx]);
    }
}
