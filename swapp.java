import java.util.Scanner;
public class swapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        swap(10,20);
    }

    static void swap(int a,int b) {
        Scanner sc = new Scanner(System.in);
        int temp = a;
        a = b;
        b =temp;
        System.out.println("you 1 " + a);
        System.out.println("youuu 2 " + b);


    }

}
