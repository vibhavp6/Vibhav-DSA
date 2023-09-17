import java.util.Scanner;

public class numbertobesearches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int [] freq = makefrequencies(arr);
        System.out.println("enter the no of queries");
        int q = sc.nextInt();
        while (q>0) {
            System.out.println("enter the number to be searched");
            int x = sc.nextInt();
            if (freq[x] >0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            q--;
        }

    }

    static void print (int [] arr) {
        for (int i =0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int [] makefrequencies (int [] arr ) {
        int [] frequency = new int [100005];
        for (int i =0; i < arr.length;i++) {
            frequency[arr[i]]++;
        }
        return frequency;
    }
}
