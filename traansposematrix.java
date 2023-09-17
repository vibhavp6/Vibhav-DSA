import java.util.Scanner;

public class traansposematrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and column matrix 1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] vib = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                vib[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix 1 before transpose:");
        print(vib);
        System.out.println("after transpose");
//        int [][] vibhu = trasnposee(vib,r1,c1);
//        print(vibhu);
        print(trasnposee(vib,r1,c1));
    }
    static void print(int[][] vib) {
        for (int i = 0; i < vib.length; i++) {
            for (int j = 0; j < vib[i].length; j++) {
                System.out.print(vib[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int [][] trasnposee(int [][] vib , int r1, int c1 ) {
        int [][] newarrayy = new int [c1][r1];
        for (int i =0; i<c1; i ++) {
            for (int j = 0; j <r1; j ++) {
                newarrayy [j][i] = vib [i][j];
            }
        }
        return newarrayy;
    }


    // in place
    static void trnasposenew(int [][] vib, int r1 , int c1) {
        for (int i = 0; i <c1;  i ++) {
            for (int j =i; j <r1; j ++) {
                // swap
                int temp = vib [i][j];
                vib [i][j] = vib [j][i];
                vib[j][i] = temp;
            }
        }
    }
}
