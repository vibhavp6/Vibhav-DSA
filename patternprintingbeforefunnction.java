package homework;

public class patternprintingbeforefunnction {
    public static void main(String[] args) {
        for ( int n =1; n <=4; n++) {
            for (int i = 1; i <=n; i++) {
                System.out.print(i);
                i++;

            }
            System.out.println();
        }
    }
}
