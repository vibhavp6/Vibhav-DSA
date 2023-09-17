import java.util.Scanner;

public class checkequallypartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("it is  " + prefixsuffixequalsum(arr));
    }
//    static int totalsum(int [] arr ) {
//        int totalssumm =0;
//        for (int i =0; i< arr.length; i++) {
//            totalssumm +=arr[i];
//        }
//        return totalssumm;
//    }

    static Boolean prefixsuffixequalsum(int [] arr) {
        int vib =0;
//      int vib = totalsum(arr);
        for (int i =0; i< arr.length; i++) {
            vib += arr[i];
        }
        int prefixsum = 0;
        for (int i = 0; i<arr.length; i++) {
            prefixsum += arr[i];
            int suffixsum = vib - prefixsum;
            if( suffixsum == prefixsum) {
                return true;
            }
        }
        return false;
    }
}
