public class patterns {
    public static void hollowrectangle(int totalrow , int totalcolumns ) {
        // outer loop
        for (int i = 1; i<=totalrow ; i++ ) {
            // inner - column
            for (int j = 1; j <=totalcolumns; j++) {
                 // cell (i,j)
                 if (i == 1 || i == totalrow || j == 1 || j ==  totalcolumns) {
                     System.out.print("*");
                 } else {
                     System.out.print(" ");

                 }

            }
            System.out.println();

        }


    }

    public static void main(String[] args) {
        hollowrectangle(4,5);
    }
}

