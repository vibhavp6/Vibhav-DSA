package homework;
import java.util.Scanner;
public class productoftwonnumbverfunctionmethod {
    public static void main(String[] args) {
       int vibh = product();
        System.out.println(vibh);
       // products();

    }


    static int product() {
        Scanner sc =  new Scanner(System.in);
        int a =  sc.nextInt();
        int b = sc.nextInt();
        int num = a *b;
        return num;
    }

    static void products() {
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        int b = sc.nextInt();
        int num = a*b;
        System.out.println(num);
    }




}




