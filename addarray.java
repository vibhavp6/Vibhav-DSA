import java.util.Scanner;
public class addarray {
    public static void main(String[] args) {
        int res = add();
        System.out.println(res);

    }


    static int add () {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements");
        int a  = sc.nextInt();
        int [] arr = new int [a];
        int sum =0;
        for (int i = 0; i < arr.length; i ++) {
            arr [a] = sc.nextInt();
            sum += arr[a];
        }
        return a;

    }
}
