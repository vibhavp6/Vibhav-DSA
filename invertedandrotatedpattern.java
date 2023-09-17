public class invertedandrotatedpattern {
    public static void invertedpattern(int n) {
        // outer
        for (int i =1; i <=n; i++) {
            // inner and space
            for (int j = 1; j<=n-i; j ++ ) {
                System.out.print(" ");

            }
            // stars
            for (int j =1; j<= i;j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }


    public static void invertedhalfnumbers (int n) {
        for (int i =1; i <= n;i++) {
            //inner
            for (int j = 1; j <= n-i+1; j ++) {
                System.out.print(j);
            }
            // next line
            System.out.println();
        }

    }


    public static void flyodtriangle (int n) {
        int counter =1;
        for (int i = 1; i <= n; i ++) {
            //how many times  counter will be printed
            for (int j  = 1; j <=i; j++){
                System.out.print(counter);
                counter ++;

            }
            System.out.println();

        }

    }


    public static void zeroonetriangle (int n) {
        for (int i = 1; i<=n; i++) {
            // inner
            for (int j = 1; j <=i; j ++ ) {
                if ((i +j)%2==0) {
                    System.out.print("1");

                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }


    }


    //public class butterfly {
        //  public class ButterflyPattern {
        public static void butterfly(int n) {
            // First half
            for (int i = 1; i <= n; i++) {
                // Stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                // Spaces
                for (int j = 1; j <= (2 * n) - (2 * i); j++) {
                    System.out.print(" ");
                }
                // Stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Second half
            for (int i = n; i >= 1; i--) {
                // Stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                // Spaces
                for (int j = 1; j <= (2 * n) - (2 * i); j++) {
                    System.out.print(" ");
                }
                // Stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }


    public static void solidrhobus(int n) {
        for (int i = 1; i <=n; i++) {
            // spaces
            for (int j = 1; j <=(n-i); j ++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j<=n; j++ )
                System.out.print("*");

            System.out.println();

        }

    }

    public static void hollowrhombus(int n) {
        for (int i = 1; i <=n; i++) {
            //spaces
            for (int j = 1; j <=(n-i); j++) {
                System.out.print(" ");
            }
            //holow rectangle - stars
            for (int j = 1; j <=n; j ++) {
                if (i == 1 || i == n || j ==1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void diamond (int n)  {
        for (int i =  1; i <=n; i ++) {
            for (int j = 1; j<= (n-i); j++ ) {
                System.out.print(" ");
            }
            for (int j =1; j <= (2*(i)-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i =n; i>=1; i--) {
            for (int j = 1; j<= (n-i); j++ ) {
                System.out.print(" ");
            }
            for (int j =1; j <= (2*(i)-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void numberpyramid(int n) {
     //   int counter = 1;
        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <=(n-i) ; j ++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
               // counter++;
            }
            System.out.println();
        }

    }

    public static void PALINDROMICPattern (int n) {
         for (int i = 1; i <=n; i ++) {
             //
             for  (int j = 1; j <= (n-i); j ++ ) {
                 System.out.println(" ");
             }
             //descending
             for (int j =i; j >= 1; j--  ) {
                 System.out.print(j);
             }
             // ascending
             for (int j = 2; j <=i; j++ ) {
                 System.out.print(j);
             }
             System.out.println();
         }
    }





    public static void main(String[] args) {
       // invertedhalfnumbers(4);
       // flyodtriangle(4);
       // zeroonetriangle(4);
        //butterfly(6);
       // solidrhobus(5);
       // hollowrhombus(5);
        //diamond(4);
      //  numberpyramid(5);
        PALINDROMICPattern(5);

    }
}
