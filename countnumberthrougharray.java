import java.util.Scanner;
public class countnumberthrougharray {
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

        System.out.println("enter x");
        int x = sc.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] == x) {
                count++;
            //    System.out.println("your count " + count);
            }
        }
        System.out.println("your count " + count);
    }
}