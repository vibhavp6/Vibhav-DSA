package homework;
import java.util.Scanner;
public class functionmeethodtovote {
    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
  //      System.out.println("enter your age");
    //    int n = sc.nextInt();
       // int num = age(n);
       //System.out.println(num);
        age3();
    }

    static int age (int n) {
        if (n < 18) {
            System.out.println("can't vote");
        } else {
            System.out.println("vote");
        }
        return n;
    }



    static void age2 () {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your no of times to check");
        int n = sc.nextInt();
        for (int i = 1;  i <=n ; i ++) {
            System.out.println("enter yourt age " + i);
            int a = sc.nextInt();
            if ( a >= 18) {
                System.out.println("vote");
            } else {
                System.out.println("can't vote");
            }
        }

    }


    static void age3 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int n =  sc.nextInt();
        if ( n < 18) {
            System.out.println("can't vote");
        } else {
            System.out.println("vote");
        }
    }


}
