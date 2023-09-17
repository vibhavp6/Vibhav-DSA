import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if (num %5 == 0 && num%2 == 0 ){
            System.out.println("good");
        } else {
            System.out.println("bad");
        }
    }
}

