import java.util.Scanner;
public class printrepeatnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        int rr = lastnumberrepeat(arr);
        System.out.println("your repeated number " + rr);
    }
    static int repeat (int [] arr) {
        for (int i =0; i <arr.length; i ++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    static int lastnumberrepeat (int [] arr) {
        for (int i =arr.length-1; i >=0; i --) {
            for (int j = i-1; j>=0; j--) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
