import java.util.Scanner;

public class circumfrenceandarea {
    public static void main(String[] args) {
        int vib = arae();
        System.out.println(vib);
    }


    static int  arae() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your radius");
        double radius = sc.nextDouble();
        double area = Math.PI*radius*radius;
        System.out.println("your area " + area);
        double circumfrence = 2*Math.PI*radius;
        System.out.println("your circumfrence" + circumfrence);

        return 0;
    }
}


