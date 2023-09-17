import java.util.Scanner;
public class printnumber1tonn {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int counter = 1;

    while(counter <= a) {
        System.out.print(counter + " ");
       counter ++;
    }

  }


}
