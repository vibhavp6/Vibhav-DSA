package homework;
import java.util.Scanner;
public class checkevenoddnew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your elements");
        int num = sc.nextInt();


        for (int i = 1; i <=num; i++) {
            System.out.println("enter your number" + i);
            int n = sc.nextInt();
            if ( n %2==0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

        }
    }


}
