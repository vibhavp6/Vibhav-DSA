import java.util.Scanner;
// pehle transpose kr do aur phir reverse kr do by 90
public class rotatematrix {
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
        System.out.println("matrix 1 before rotation:");
        print(vib);
        System.out.println("after rotation");
        print(rotate(vib,r1,c1));
    }
    static void print(int[][] vib) {
        for (int i = 0; i < vib.length; i++) {
            for (int j = 0; j < vib[i].length; j++) {
                System.out.print(vib[i][j] + " ");
            }
            System.out.println();
        }
    }
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

    static void reverse(int [] arr) {
        int i =0 , j = arr.length-1;
        while (i <j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i ++ ;
            j -- ;
        }
    }
    static int [][] rotate (int [][]vib , int r1, int c1) {
        trnasposenew(vib,r1,c1);
        for (int i =0; i<r1; i ++) {
            reverse(vib[i]);
        }
        return vib;
    }
}
