import java.util.Scanner;
public class prefixsumarrray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("intial innput");
        print(arr);
        System.out.println("after prefix sum");
//        print(prefixsumtwo(arr));
        int [] ans = prefixsum(arr);
        print(ans);
    }

    static void print (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int [] prefixsum(int [] arr) {
        int [] pref = new int [arr.length];
        pref [0] = arr[0];
        for (int i = 1; i<arr.length; i++) {
            pref [i] = pref[i-1] + arr[i];
        }
        return pref;
    }

    // by not creating a new array
    static int [] prefixsumtwo(int [] arr) {
        int n = arr.length;;
        for (int i = 1; i<arr.length; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
}
