package Recursion;
import java.util.Scanner;
public class towerofhanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int a =sc.nextInt();
        int b = sc.nextInt();
        int c =sc.nextInt();
        tower(m,a,b,c);
    }
    static void tower(int m ,int a , int b , int c) {
        if (m == 0) {
            return;
        }
        tower(m-1,a,c,b);
        System.out.println(m + "[" + a + " -> " + b + "]");
        tower(m-1,c,b,a);
    }
}
