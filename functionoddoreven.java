package homework;
import java.util.Scanner;

public class functionoddoreven {
    public static void main(String[] args) {
        oddeven();
    }


    static void oddeven() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n %2==0) {
            System.out.println("even");

        } else {
            System.out.println("odd");
        }

    }
}
