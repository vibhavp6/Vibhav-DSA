import java.util.Scanner;
public class conditoonalassignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your profit");
        int sp  =  sc.nextInt();
        System.out.println("enter your  loss");
        int cp = sc.nextInt();
        System.out.println("enter your profit");
        int profit = sc.nextInt();
        System.out.println("enter your loss");
        int loss = sc.nextInt();
        if (cp<sp){
            loss = cp - sp;
            System.out.println("loss");
        } else if ( sp > cp){
            profit = sp -cp;
            System.out.println("profit");
        }







    }


}
