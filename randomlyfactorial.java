package homework;
import java.util.Scanner;
public class randomlyfactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = 1;
        int n = sc.nextInt();
        for (int i =1; i <=n;  i++) {
             f *= i;
            System.out.println(f);
        }

    }
}