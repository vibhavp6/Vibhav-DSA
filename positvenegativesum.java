import java.util.Scanner;

public class positvenegativesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        System.out.println("Enter numbers (terminate with 0):");

        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break; // Exit the loop when 0 is entered
            }

            if (num < 0) {
                sumNegative += num;
            } else if (num % 2 == 0) {
                sumPositiveEven += num;
            } else {
                sumPositiveOdd += num;
            }
        }

        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);
    }
}

