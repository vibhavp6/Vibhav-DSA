package homework;
import java.util.Scanner;

public class reversehw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while (n >0) {
            int ld = n%10;
            ans = ans*10 +ld;
            n = n/10;
        }
        System.out.println(ans);
    }
}
