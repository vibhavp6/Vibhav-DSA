import java.util.Scanner;
//Array Manipulation
public class targetsumarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("enter " + n + " elements ");
        for (int i = 0 ; i < arr.length; i++) {
             arr [i] = sc.nextInt();
        }

        for (int i = 0 ; i < arr.length; i ++ ) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("your target pairs is times " + targetsum(arr));
    }

    static int targetsum(int [] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter target");
        int target = sc.nextInt();
        int ans = 0;
        for (int i = 0 ; i< arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j +1 ; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr [k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
