package Recursion;

import java.util.Scanner;

public class maximumofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int [a];
        for (int i = 0 ; i<arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int max = displaymax(arr, 0);
        System.out.println(max);
    }
    static int displaymax(int [] arr , int idx) {
        if (idx == arr.length) {
            return 0;
        }
        int misa = displaymax(arr,idx+1) ;
        if (misa>arr[idx]) {
            return misa;
        } else {
            return arr[idx];
        }
    }

}
