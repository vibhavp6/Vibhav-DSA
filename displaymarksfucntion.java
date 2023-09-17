package homework;
import java.util.Scanner;

public class displaymarksfucntion {
    public static void main(String[] args) {
        String vib = grades();
        System.out.println(vib);
    }
    static String grades() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your no of times");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++ ) {
            System.out.println("enter your marks out of 100");
            int gra = sc.nextInt();
            if (gra >= 91 && gra <= 100) {
                System.out.println(" grades : AA ");
            }
            if (gra >= 81 && gra <= 90) {
                System.out.println(" grades : AB ");
            }
            if (gra >= 71 && gra <= 80) {
                System.out.println(" grades : BB ");
            }
            if (gra >= 61 && gra <= 70) {
                System.out.println(" grades : BC ");
            }
            if (gra >= 51 && gra <= 60) {
                System.out.println(" grades : CD ");
            }
            if (gra >= 41 && gra <= 50) {
                System.out.println(" grades : DD ");
            }
            if (gra <= 40) {
                System.out.println(" fail ");
            }
        }
        return grades();
    }
}
