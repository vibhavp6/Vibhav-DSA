package homework;

public class averageofthreenumbers {
    public static int average(int a , int b , int c) {
        int average = (a +b +c )/3;
        System.out.println(average);

        return average;

    }



    public static void main(String[] args) {
        int a = 5 ;
        int b = 20 ;
        int c = 30;
        average(a,b,c);

    }
}
