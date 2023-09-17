import java.util.Scanner;

public class rangequeryprefixsumarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("enter " + n + " elements ");
        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int [] vaib = rangeprefix(arr);
        System.out.println("how many times u want to search the range");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("enter the range r ");
            int r = sc.nextInt();
            System.out.println("enter the range l ");
            int l = sc.nextInt();
            int vib =  vaib[r] + vaib[l-1];
            System.out.println("your range " + vib);
            q--;
        }
    }
    static void print (int [] arr) {
        for (int i =1; i<=arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int [] rangeprefix(int [] arr) {
        for(int i =1; i<arr.length;i++) {
            arr[i] +=  arr[i-1] ;
        }
        return arr;
    }
}