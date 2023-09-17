import java.util.Scanner;

public class rotatearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }
        System.out.print("enter by which you wanted to repeat");
        int k = sc.nextInt();

        rotateinplace(arr,k);
        print(arr);
    }

    static void print (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int [] rotate (int [] arr,int k) {
        int n = arr.length;
        k= k % n;
        int [] ans = new int [n];
        int counter =0;
        for (int i = n-k; i<n; i++) {
            ans [counter ++] = arr[i];
        }
        for (int i =0; i<n-k; i++) {
            ans[counter] = arr[i];
            counter ++;
        }
        return ans;
    }
    // in place

    static void swap (int [] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void reversethrughswap (int [] arr,int i ,int j) {
//        int i =0;
//        int j = arr.length-1;
        while (i<j) {
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotateinplace (int []arr,int k ) {
        int n =arr.length;
        k = k%n;
        reversethrughswap(arr,0,n-k-1);
        reversethrughswap(arr,n-k, n-1);
        reversethrughswap(arr,0,n-1);

    }
}
