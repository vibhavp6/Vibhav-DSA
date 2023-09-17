import java.util.Scanner;
public class minandmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your elements");
        int n = sc.nextInt();
        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.println("enter your number " + i);
            int num = sc.nextInt();
            if (num > max) {
                max = num;
            }

            if (num < min ) {
                min = num;
            }
        }

        System.out.println(max);
        System.out.println("your min" + min);
    }
}
