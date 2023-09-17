public class logicaloperator {
    public static void main(String[] args) {
        int p = 20, q = 10;
        System.out.println((p>q && q<p));
        System.out.println((p<q || p>q));
        System.out.println(!(p==q));
        System.out.println(!(p>q && q<p));

    }
}
