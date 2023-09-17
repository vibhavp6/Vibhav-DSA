import java.util.Scanner;

public class sortedtwopinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print(" Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(" original array ");
        print(arr);
        twopointer(arr);
        System.out.println("rew");
        print(arr);
    }
    static void swap (int [] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void print (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void twopointer(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr,left,right);
                left ++;
                right--;
            } else if (arr[left] == 0){
                left++;
            } else if (arr[right] ==1) {
                right --;
            } else {
                System.out.println("no work");
            }
        }
    }
}
