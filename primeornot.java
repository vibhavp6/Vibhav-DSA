
import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number to check if it's prime:");

        // Read the number entered by the user
        int n = sc.nextInt();

        // Check if the number is 2 (the smallest prime number)
        if (n == 2) {
            System.out.println("The number is prime.");
        } else {
            // Assume the number is prime until proven otherwise
            boolean isPrime = true;

            // Check if the number has any divisors other than 1 and itself
            for(int i = 2; i <= n-1; i++) {
                if (n % i == 0) {
                    // If a divisor is found, the number is not prime
                    isPrime = false;
                    break;
                }
            }

            // Print the result
            if(isPrime == true) {
                System.out.println("The number is prime.");
            } else {
                System.out.println("The number is not prime.");
            }
        }

        // Close the Scanner object
        sc.close();
    }
}
