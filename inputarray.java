import java.util.Scanner;
public class inputarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elemnents ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int vib : arr) {      // first method 2 print
            System.out.print(vib + " ");
        }
        samearray(arr); // 2nd method to print

    }
    static void samearray(int[] arr) { // for shortcut
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}