public class invertedstarpattern {
    public static void main(String[] args) {
        int n =4;
        for (int i= 1; i <=4; i++) {
            for (int star =1; star <= 4-i+1; star++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
