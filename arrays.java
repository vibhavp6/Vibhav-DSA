import java.util.Scanner;

public class arrays {


    public static void arrayscc (int marks []) {
        for (int i = 0; i < marks.length; i ++) {
            marks [i] = marks [i] + 1;
        }
    }


    public static void main(String[] args) {
        int marks [] = {99,100,101};
        arrayscc(marks);
/// print marks
        for (int i = 0; i < marks.length; i ++) {
            System.out.println(marks[i]);
        }
        System.out.println();
    }
}
