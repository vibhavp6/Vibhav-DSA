import java.util.Scanner;

public class reversematrix {
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
        System.out.println("matrix 1 before reverse:");
        print(vib);
        int [][] vibs = reverseNews(vib, r1, c1); //Use the new reverseNew method instead of the old one
        System.out.println("matrix 1 after reverse:");
        print(vibs);
        System.out.println("not new array created");
        print(reverse(vib,r1,c1));
    }

    static void print(int[][] vib) {
        for (int i = 0; i < vib.length; i++) {
            for (int j = 0; j < vib[i].length; j++) {
                System.out.print(vib[i][j] + " ");
            }
            System.out.println();
        }
    }


    static void swap(int[][] vib, int i, int j, int k) {
        int temp = vib[i][j];
        vib[i][j] = vib[i][k];
        vib[i][k] = temp;
    }

    static int[][] reverse(int[][] vib, int r1, int c1) {
        int j, k;
        for(int i=0; i<r1; i++) {
            j = 0;
            k = c1 - 1;
            while(j < k) {
                swap(vib, i, j, k);
                j++;
                k--;
            }
        }
        return vib;
    }

    // New reverse method using a new array instead of swapping
    static int[][] reverseNews(int[][] vib, int r1, int c1) {
        int[][] newMatrix = new int[r1][c1];
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                newMatrix[i][j] = vib[i][c1-1-j];
            }
        }
        return newMatrix;
    }
}


