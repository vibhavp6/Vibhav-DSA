public class trial {
    public static void main(String[] args) {
      // change value
      int o =  222;
      int b = 8;
      int c = 333;
      changeint(o,b);
        System.out.println(o);
        System.out.println(b);
        System.out.println(c);


        //array
        int [] a = new int [3];
        a [0] = 2;
        a [1] = 6;
        a [2] = 8;
        changevalue(a);
        for (int i = 0; i <a.length; i++) {
            System.out.println(a [i] + " ");
        }
    }

    static void changevalue(int [] a ) {
        a [0] = 500;
        a [1] = 666;
    }


    static void changeint(int o , int b) {
        o = 506;
        b= 300;
    }
}
