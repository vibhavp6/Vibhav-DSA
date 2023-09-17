import java.util.Arrays;
import java.util.Scanner;
public class smalestlargestarray {
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
        Arrays.sort(arr);
        int [] ans = {arr[0], arr.length};
        System.out.println("smallest " + arr[0]);
        System.out.println("largest" + arr.length);
    }

    static int[] same () {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        Arrays.sort(arr);
        int [] ans = {arr[0], arr.length};
        System.out.println("smallest " + arr[0]);
        System.out.println("largest" + arr.length);
        return ans;
    }
}