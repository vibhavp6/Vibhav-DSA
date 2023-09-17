import java.util.Scanner;
public class maxandminarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("your 3rd maximum " + thirdmax(arr));
    }


//    static int maxandmin(int[] arr) {
//        int max = arr[0];
//        int secondMax = Integer.MIN_VALUE;
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                secondMax = max;
//                max = arr[i];
//            } else if (arr[i] > secondMax && arr[i] != max) {
//                secondMax = arr[i];
//            }
//        }
//
//        if (secondMax == Integer.MIN_VALUE) {
//            System.out.println("There is no second max");
//            return Integer.MIN_VALUE; // you return any suitable value depending on your requirements
//        }
//
//        return secondMax;
//    }


    static int maxsh(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static int secondmax(int[] arr) {
        int vib = maxsh(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == vib) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmax = maxsh(arr);
        return secondmax;
    }
    static int thirdmax (int [] arr) {
        int mb = secondmax(arr);
        for (int i = 0; i <arr.length; i ++) {
            if (arr[i] == mb) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int third = secondmax(arr);
        return third;
    }

}
