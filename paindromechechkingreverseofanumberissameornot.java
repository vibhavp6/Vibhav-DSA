package homework;

public class paindromechechkingreverseofanumberissameornot {
    public static int reverse (int n) {
        int rem = 0;
        while (n >0) {
            int LastDigit = n % 10;
            rem = (rem *10) + LastDigit;
            n = n /10;
        }
        return rem ;
    }

    public static Boolean isPalindrome (int n) {
        int reversed = reverse(n);
        return n == reversed;
    }
    
    public static void main(String[] args) {
        System.out.println(isPalindrome(111));

    }

}
