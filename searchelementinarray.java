import java.util.Scanner;
public class searchelementinarray {
    public static void main(String[] args) {
        int[] find = {0, 2, 5, 9, 19, 18};
        int x = 19;
        int ans = 0;
        for (int i = 0; i < find.length; i++) {
            if (find [i] == x ) {
                ans = i;
                break;
            } else {
                System.out.println("not found");
            }
        }
        System.out.println("your indext at " +  x + " is " + ans);
    }
}