import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;
public class printallprimenumbersbetween {
    public static void main(String[] args) {
        print();
    }
    static void print() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your lower number ");
        int lower = sc.nextInt();
        System.out.println("enter your upper  number ");
        int upper = sc.nextInt();
        for (int n =2; n <=upper; n++) {
            if(isprime(n)) {
                System.out.println(n);
            }
        }
    }
    static Boolean isprime(int a) {
        if (a==2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a%i==0) {
                return false;
            }
        }
        return true;
    }
}
