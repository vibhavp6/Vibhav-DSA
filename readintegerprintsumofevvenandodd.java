package homework;
import java.util.Scanner;
public class readintegerprintsumofevvenandodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evensum = 0;
        int oddsum = 0;
        System.out.println("enter nnumber of intergers");
        int count = sc.nextInt();
        System.out.println("enter integers");
        for (int i = 0 ;  i <= count; i++ ) {
            int n = sc.nextInt();
            if (n%2==0) {
                evensum += n;
            } else {
                oddsum += n;
            }


        }
        System.out.println(" your even sum is" + evensum);
        System.out.println("your odd sum is" + oddsum);
    }
}
