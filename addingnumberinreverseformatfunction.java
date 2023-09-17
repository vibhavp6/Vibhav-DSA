package homework;
import java.util.Scanner;

public class addingnumberinreverseformatfunction {
    public static int addnumber (int n) {
        int sumdifit = 0;
        while (n>0) {
            int LastDigit = n %10;
            sumdifit +=LastDigit;
            n /= 10;

        }
        return sumdifit ;
    }








    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int a = sc.nextInt();
        System.out.println(addnumber(a));


    }
}
