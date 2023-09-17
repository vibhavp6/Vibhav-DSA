import java.util.Scanner;
public class multiDArray {
    public static void main(String[] args) {
       int [][] multi = {{25,46,03}, {45,44,43} , {22,1}};
       for (int i = 0 ; i < multi.length; i ++){
           for (int j =0; j <multi[i].length; j++) {
               System.out.println(multi[i][j]);
           }
       }
    }
}
