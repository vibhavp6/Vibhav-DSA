import java.util.Scanner;

public class generatespiralmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the matrix(nxn): ");
        int n = sc.nextInt();
        int[][] vib = generateSpiral(n);
        print(vib);
    }

    static void print(int[][] vib) {
        for (int i = 0; i < vib.length; i++) {
            for (int j = 0; j < vib[i].length; j++) {
                System.out.print(vib[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int [][] generateSpiral(int n) {
        int [][] vib = new int [n][n];
        int leftcolumn = 0, rightcolumn = n-1, toprow = 0, bottomrow = n-1;
        int curr = 1;
        while (curr <= n*n) {
            // leftcolumn to rightcolumn
            for (int j = leftcolumn ; j <= rightcolumn && curr <=n*n; j ++ ) {
                vib[toprow][j] = curr++;
            }
            toprow ++;
            // toprow to bottomrow
            for (int i = toprow ; i <= bottomrow && curr <=n*n ; i++) {
                vib[i][rightcolumn] = curr++;
            }
            rightcolumn--;
            for (int j = rightcolumn; j >= leftcolumn && curr <=n*n; j-- ) {
                vib[bottomrow][j] = curr++;
            }
            bottomrow--;
            for (int i = bottomrow; i >=toprow && curr <=n*n; i --) {
                vib[i][leftcolumn] = curr++;
            }
            leftcolumn++;
        }
        return vib;
    }
}
