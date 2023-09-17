import java.util.Scanner;
public class linearsearch {
    public static int linearsearch(int marks[] , int key ) {
        for (int i = 0; i < marks.length; i ++) {
            if ( marks [i] == key) {
                return i ;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int marks [] = {2,4,6,8,10,12,14,16};
        int key = 10;
        int index = linearsearch(marks,key) ;
        if (index == - 1) {
            System.out.println("not found");
        } else {
            System.out.println(" index " + index);
        }

    }
}
