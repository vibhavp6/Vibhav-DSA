import java.util.Scanner;

public class addtionoftwomatrix {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        System.out.println("enter row");
        int r1 = sc.nextInt();
        System.out.println("eneter column");
        int c1 = sc.nextInt();
        int[][] vib = new int[r1][c1];
        for (int i = 0; i < r1; i++) { // row
            for (int j = 0; j <c1; j++) { // column
                vib[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter row matrix 2");
        int r2 = sc.nextInt();
        System.out.println("eneter column matrix 2");
        int c2 = sc.nextInt();
        int[][] vibh = new int[r1][c2];
        for (int i = 0; i < r2; i++) { // row
            for (int j = 0; j <c2; j++) { // column
                vibh[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix 1");
        print(vib);
        System.out.println("matrix 2");
        print(vibh);
        add(vib,r1,c1,vibh ,r2,c2);

    }
    static void print(int[][] vib) {
        for (int i = 0; i < vib.length; i++) { // row
            for (int j = 0; j < vib[i].length; j++) {// column
                System.out.print(vib[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void add(int [][] vib,int r1, int c1, int [][]vibh,int r2,int c2) {
         if (r1 != r2 || c2 != c1  ) {
             System.out.println("wrong input");
             return;
         }
         int [][] sum = new int [r1][c1];
         for (int i = 0 ; i <r1; i++) {
             for (int j =0; j <c1; j ++) {
                 sum [i][j] = vib[i][j] + vibh[i][j];
             }
         }
        System.out.println("sum");
         print(sum);
    }


}
