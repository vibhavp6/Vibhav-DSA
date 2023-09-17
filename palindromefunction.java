import java.util.Scanner;
public class palindromefunction {
    public static void main(String[] args) {
        boolean result = same();
        System.out.println(result ? "Palindrome" : "Not a Palindrome");
    }
    static int reverseNumber(int n) {
        int reversed = 0;
        int originalNumber = n;
        while (n > 0) {
            int ld = n % 10;
            n = n / 10;
            reversed = (reversed * 10) + ld;
        }
        return reversed;
    }
    static boolean same() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int reversed = reverseNumber(n);
        return n == reversed;
    }
}

