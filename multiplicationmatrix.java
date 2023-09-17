import java.util.Scanner;

public class multiplicationmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and column matrix 1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] vib = new int[r1][c1];
        for (int i = 0; i < r1; i++) { // row
            for (int j = 0; j <c1; j++) { // column
                vib[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter row and column matr ix 2");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] vibh = new int[r2][c2];
        for (int i = 0; i < r2; i++) { // row
            for (int j = 0; j <c2; j++) { // column
                vibh[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix 1");
        print(vib);
        System.out.println("matrix 2");
        print(vibh);
        mult(vib,r1,c1,vibh ,r2,c2);

    }
    static void print(int[][] vib) {
        for (int i = 0; i < vib.length; i++) { // row
            for (int j = 0; j < vib[i].length; j++) {// column
                System.out.print(vib[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void mult(int [][] vib,int r1, int c1, int [][]vibh,int r2,int c2) {
        if (r2 != c1  ) {
            System.out.println("wrong input");
            return;
        }
        int [][] multiply = new int [r1][c2];
        for (int i = 0 ; i <r1; i++) {
            for (int j =0; j <c2; j ++) {
                for (int k = 0; k < r2; k++) {
                    multiply[i][j] += (vib[i][k] * vibh[k][j]);
                }
            }
        }
        System.out.println("multiply");
        print(multiply);
    }
}
