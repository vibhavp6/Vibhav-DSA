import java.util.Scanner;

public class prefixsummatrix {
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
        // call
            System.out.println("enter l1,r1,l2,r2 ");
            int l = sc.nextInt(); //   row
            int r = sc.nextInt(); // column
            int ll = sc.nextInt();
            int rr = sc.nextInt();
//\
            int anss = sumpredetermine3(vib, l, r, ll, rr);
            System.out.println(anss + "  ii");
    }

    static void print(int[][] vib) {
        for (int i = 0; i < vib.length; i++) {
            for (int j = 0; j < vib[i].length; j++) {
                System.out.print(vib[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 1st mwthod
    static int sumbrute(int [][] vib, int l,int r, int ll , int rr) {
        int sum = 0 ;
        for (int i = l ; i <=ll; i ++) {
            for (int j = r; j <=rr; j ++) {
                sum += vib[i][j];
            }
        }
        return sum;
    }

    // 2nd method

    static void findprefix(int [][] vib ) {
        int r1 = vib.length;
        int c1= vib[0].length;
        // row sum
        for (int i = 0; i<r1; i++) {
            for (int j =1; j < c1; j++) {
                vib [i][j] += vib[i][j-1];
            }
        }
        // column wise sum
        for (int j = 0; j <c1; j ++) {
            for (int i = 1; i <r1;  i ++) {
                vib [i][j] += vib [i-1][j];
            }
        }
    }
    static int sumpredetermine(int [][] vib, int l,int r, int ll , int rr) {
        int sum = 0;
        findprefix(vib);
        for (int i = l ; i <= ll; i++) {
                // r1 to r2 sum for row i
            if (r >=1)
                sum += vib [i][rr] - vib [i][r-1];
            else  {
                sum += vib[i][rr];
            }
        }
        return sum;
    }

    // 3rd method
    static int sumpredetermine3(int [][] vib, int l,int r, int ll , int rr) {
        int anss = 0, sum = 0, left = 0, leftup =0, up = 0;
        findprefix(vib);
        sum = vib[ll][rr];
        if (r >=1) {
            left = vib[ll][r - 1];
        }
        if (l >=1) {
            up = vib [l-1][r];
        }
        if (l >=1 && r >=1) {
            leftup= vib[l-1][r-1];
        }
        anss = sum - left -up + leftup;
        return anss;
    }
}
