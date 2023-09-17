import java.util.Scanner;
public class sumoffirstnnaturalnnnnumber {
    public static void main(String[] args) {
        int vib = sum();
        System.out.println(vib);
    }


    static int sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            sum += i;
        }
        return sum;
    }
}
