import java.util.Scanner;
public class functionswithparameters {
    public static void swap (int a, int b) {
        //swap
        int temp =  a;
        a=b;
        b=temp;
        System.out.println("your a is " + a);
        System.out.println("your b is " + b);

    }


    public static void main(String[] args) {
       int a  =10;
       int b =20;
        swap (a,b);
    }
}
