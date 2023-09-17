import java.util.Scanner;

public class fibroaccni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.print("Fibonacci Series: " + firstTerm + ", " + secondTerm);
        for (int i = 2; i < n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}