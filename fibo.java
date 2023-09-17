import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter the length of the Fibonacci Series: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci Series: ");
        for (int i =1; i <=n ; i++) {
          System.out.println(a);
           // int c = b;
            int c = a + b;
            a=b;
            b=c;

        }

    }
}

