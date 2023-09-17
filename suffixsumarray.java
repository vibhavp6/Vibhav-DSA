import java.util.Scanner;

public class suffixsumarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("original array ");
        print(arr);
        int [] vib =  suffixx(arr);
        print(vib);
    }
    static void print (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int [] suffixx(int []arr ){
        int n = arr.length;
        for (int i =n-1; i>0; i--) {
            arr[i-1] += arr[i];
        }
        return arr;
    }
 }
