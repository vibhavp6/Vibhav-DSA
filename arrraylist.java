import java.util.ArrayList;

public class arrraylist {
    public static void main(String[] args) {
        // wrapper classs - needed fow class as this works in object and  java wprks mostly on objects and int i is variable sometimes they can't work
//        Integer i = Integer.valueOf(3);
//        System.out.println(i);
        ArrayList<Integer> l1 = new ArrayList<>();
//        ArrayList<Boolean> l2 = new ArrayList<>();
        // add new element
        l1.add(5); // 5
        l1.add(4); // 5 4
        // get an element at index 1
        System.out.println(l1.get(1)); // 4



        // print with for loop
        for (int i =0; i <l1.size(); i++) {
            System.out.println(l1.get(i)); // 5, 4
        }


        // printing the array list directly
        System.out.println(l1); // [5,4]

        // adding element at some index i
        l1.add(1,100); // [5,100,4]
        System.out.println(l1);

        // modifying element at index i
        l1.set(1,10); // [5,10, 4]
        System.out.println(l1);


        // removing element at index i
        l1.remove(1);
        System.out.println(l1); // [5,4]

        // removing an element e
//        l1.remove(Integer.valueOf(4)); // [5]
//        System.out.println(l1.remove(Integer.valueOf(4))); // true
//        System.out.println(l1); // [5]


        // chechking if an element exist
        boolean anss = l1.contains(Integer.valueOf(4));
        System.out.println(anss); // true


        // if you don't specify cllass, you can put anything inside l
        ArrayList p = new ArrayList<>();
        p.add("dd");
        p.add(1);
        p.add(false);
        System.out.println(p); // [dd,1,false]
    }
}
