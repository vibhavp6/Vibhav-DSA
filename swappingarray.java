import java.util.Scanner;
public class swappingarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        swaptwomethod(5,10);
    }

//    static void swap (int a,int b) {
//        int temp =a;
//        a=b;
//        b=temp;
//        System.out.println("your a afeter swam" + a);
//        System.out.println("your b after swap" + b);
//    }

    static void swaptwomethod (int a,int b) {
        System.out.println("before swap "+ a);
        System.out.println("your before swap 2 " + b);

        a = a+b;
        a= a-b;
        b = a-b;

        System.out.println("your a afeter swam" + a);
        System.out.println("your b after swap" + b);
    }

}
