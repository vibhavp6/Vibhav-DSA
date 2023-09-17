import java.util.Scanner;
public class twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        System.out.println("enter row");
        int r = sc.nextInt();
        System.out.println("eneter column");
        int c = sc.nextInt();
        int[][] vib = new int[r][c];
        for (int i = 0; i < r; i++) { // row
            for (int j = 0; j <c; j++) { // column
                vib[i][j] = sc.nextInt();
            }
        }
        print(vib);
    }
    static void print(int[][] vib) {
        for (int i = 0; i < vib.length; i++) { // row
            for (int j = 0; j < vib[i].length; j++) {// column
                System.out.print(vib[i][j] + " ");
            }
            System.out.println();
        }
    }
}