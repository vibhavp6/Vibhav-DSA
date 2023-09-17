import java.util.Scanner;

public class pascalstriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n ");
        int n = sc.nextInt();
        System.out.println("pascal ");
        int [][] ans = pascal(n);
        print(pascal(n));
    }
    static void print(int[][] vib) {
        for (int i = 0; i < vib.length; i++) {
            for (int j = 0; j < vib[i].length; j++) {
                System.out.print(vib[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int [][] pascal(int n ){
        int [][] vib = new int [n][];
        for (int i = 0 ; i <n; i ++) {
            vib [i] = new int [i+1];
            vib[i][0] = vib [i][i] = 1;
            for (int j =1; j <i; j++) {
                vib [i][j]  =  vib[i-1][j] + vib [i-1][j-1];
            }
        }
        return vib;
    }
}
