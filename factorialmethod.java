package homework;
import java.util.Scanner;
public class factorialmethod {
    public static void main(String[] args) {
        int vib = factorial();
        System.out.println(vib);
    }
    static int factorial() {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your number of times");
        int n = sc.nextInt();
        for (int j =1; j <=n; j++) {
            System.out.println("enter your number ");
            int m = sc.nextInt();
            int f = 1;
            for (int i = 1; i <= m; i++) {
                f *= i;
            }
            System.out.println(f);
        }
        return factorial();
    }
}
