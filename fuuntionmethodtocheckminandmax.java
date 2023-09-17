package homework;
import java.util.Scanner;
public class fuuntionmethodtocheckminandmax {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Java program to find largest and smallest of three numbers");

        System.out.println("Please enter first number :");
        int first = scanner.nextInt();

        System.out.println("Please enter second number :");
        int second = scanner.nextInt();

        System.out.println("Please enter third number :");
        int third = scanner.nextInt();

        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);

        System.out.println(" largest of three numbers is " + largest);
        System.out.printf(" smallest of three numbers is " + smallest);
    }
    public static int largest(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        return max;
    }

    public static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }
        return min;
    }
}
