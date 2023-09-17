import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class reversearraylist {
    static void reversee(ArrayList<Integer> l) {
        int i = 0, j = l.size()-1;
        while (i<j) {
            Integer temp = (l.get(i));
            l.set(i,l.get(j));
            l.set(j,temp);
            i ++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList <Integer> l = new ArrayList<>();
        l.add(0);
        l.add(10);
        l.add(3);
        l.add(5);
        l.add(8);
        System.out.println("befor " + l);
        Collections.reverse(l);
//        reversee(l);
        System.out.println(l + " after");
        Collections.sort(l);
        System.out.println("after sort " + l);
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("desecending order " + l);

        ArrayList <String> p = new ArrayList<>();
        p.add("a");
        p.add("b");
        p.add("c");
        p.add("d");
        System.out.println("before of " + p);
        Collections.sort(p,Collections.reverseOrder());
        System.out.println("og got reverse ");
    }
}
