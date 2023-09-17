package homework;

public class butterfly {
  //  public class ButterflyPattern {
  public static void butterfly (int n) {
      for (int i = 1; i <=n; i ++) {
          for (int j = 1; j <=i; j ++) {
              System.out.print("*");
          }
          for (int j = 1; j <= (2 * n) - (2 * i); j++) {
              System.out.print(" ");
          }
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }
          System.out.println();
      }

      for (int i = n; i >=1; i--) {
          for (int j = 1; j <=i; j ++) {
              System.out.print("*");
          }
          for (int j = 1; j <= (2 * n) - (2 * i); j++) {
              System.out.print(" ");
          }
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }
          System.out.println();
      }

  }
            // First half


        public static void main(String[] args) {
            butterfly(5); // Example usage with n=5
        }
    }


