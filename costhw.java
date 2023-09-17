package homework;
import java.util.Scanner;

public class costhw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float subtotal = (a + b + c) ;
        float bill = ( (subtotal) * 0.18f);
        float total = bill + subtotal ;
     //   System.out.println(subtotal);
      //  System.out.println(bill);
        System.out.println(total);
    }
}
