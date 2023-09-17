import java.util.Scanner;

public class evensumoddsumloop {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int evensum = 0;
        int oddsum = 0;
        int num = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i = 0; i<n; i++) {

            if(num % 2 == 0) {
                evensum += num;
            } else {
                oddsum += num;
            }
        }
        System.out.println("Sum of even numbers: " + evensum);
        System.out.println("Sum of odd numbers: " + oddsum);
    }
}
