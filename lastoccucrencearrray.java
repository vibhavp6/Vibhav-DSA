import java.util.Scanner;
public class lastoccucrencearrray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println(arr[i] + " ");
        }
        boolean check = false;
       // int count = 0;
         for (int i = 1; i < arr.length; i ++) {
             if (arr [i] < arr[i-1]) {
                 check =false;
                 break;
             } else {
                 System.out.println("id" +check);
             }
        }
        //System.out.println("your " + x + " is " + count +  "  time ");
    }
}