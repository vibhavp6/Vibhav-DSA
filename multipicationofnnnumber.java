package homework;
import java.util.Scanner;
public class multipicationofnnnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =1; i <=10;  i++) {
            int a = 1;
            a = n* i;
            System.out.println(a);
        }
    }
}
