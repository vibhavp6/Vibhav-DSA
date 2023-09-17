import java.util.Scanner;
public class reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("enter " + n + " elements ");
        for (int i = 0; i<arr.length; i ++){
            arr[i] = sc.nextInt();
        }
        for (int i =0; i<arr.length; i ++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("you original");
        print((arr));
        int [] vib = reverse(arr);
        print(vib);

    }
    static void print (int [] arr) {
        for (int i = 0; i<arr.length; i ++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    static int  [] reverse(int []arr) {
        int [] ans = new int [arr.length];
        int j =0;
        for (int i = arr.length-1; i>=0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }


    static void reversetempmethod (int [] arr , int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverssetemp (int [] arr) {
        int i = 0;
        int j = arr.length-1;
           while (i <j) {
               reversetempmethod(arr,i,j);
               i++;
               j--;

       }
    }
}
