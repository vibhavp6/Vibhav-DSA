import java.util.Scanner;

public class spiralmatrix {
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
        System.out.println("spiral ");
//        spirals(vib,r1,c1);
        int [][] ans = spirals(vib,r1,c1);
        print(ans);
    }
    static void print(int[][] vib) {
        for (int i = 0; i < vib.length; i++) {
            for (int j = 0; j < vib[i].length; j++) {
                System.out.print(vib[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int [][] spirals(int [] []vib, int r1,int c1) {
        int leftcolumn = 0, rightcolumn = c1-1, toprow = 0, bottomrow = r1-1;
        int totalelements = 0;
        while (totalelements < r1*c1) {
            // leftcolumm to right column
            for (int j = leftcolumn ; j <=rightcolumn  && totalelements <r1*c1; j ++ ) {
                System.out.println(vib[toprow][j] + " ");
            }
            toprow ++;
            // top row to bottomrow
            for (int i = toprow ; i <=bottomrow && totalelements <r1*c1 ; i++) {
                System.out.println(vib[i][rightcolumn] + " ");
            }
            rightcolumn--;
            for (int j = rightcolumn; j >= leftcolumn && totalelements <r1*c1; j-- ) {
                System.out.println(vib[bottomrow][j] + " ");
            }
            bottomrow--;
            for (int i = bottomrow; i >=toprow && totalelements <r1*c1; i --) {
                System.out.println(vib[i][leftcolumn]);
            }
            leftcolumn++;
        }
        return vib;
    }
}
