import java.util.Scanner;
public class phytagoras {
    public static void main(String[] args) {
        boolean vin = pjythagoras();
        System.out.println("result : " + vin);
    }

    static boolean pjythagoras() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your numbers ");
        int a =  sc.nextInt();
        int b =  sc.nextInt();
        int c =  sc.nextInt();
        while (true) {
            if (c*c == (a*a) + (b*b)) {
                return true;
            }
            return false;
        }
    }
}
