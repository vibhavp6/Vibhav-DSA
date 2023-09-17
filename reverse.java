import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastdigit = 0;
        while (n > 0) {
            lastdigit = n %10;
            n = n / 10;
          // lastdigit++;


            System.out.println(lastdigit);


        }
      // System.out.println(lastdigit);



    }

}
