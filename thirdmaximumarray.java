import java.util.Scanner;
public class thirdmaximumarray {
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
        System.out.println("your 3rd maximum " + maxandmin(arr));
    }


    static int maxandmin(int[] arr) {
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if (arr[i] > thirdMax && arr[i] != max && arr[i] != secondMax) {
                thirdMax = arr[i];
            }
        }

        if (thirdMax == Integer.MIN_VALUE || thirdMax == max || thirdMax == secondMax) {
            System.out.println("There's no third maximum");
            return Integer.MIN_VALUE;
        }
        return thirdMax;
    }
}

