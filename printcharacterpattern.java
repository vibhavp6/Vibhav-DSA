public class printcharacterpattern {
    public static void main(String[] args) {
         char ch = 'A';
        for(int n = 1; n <=4; n++) {
            for (int chars = 1; chars <=n; chars++) {
                System.out.print(ch);
                ch++;

            }
            System.out.println();

        }
        //System.out.println();
    }
}
