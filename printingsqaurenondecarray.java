import java.util.Scanner;

public class printingsqaurenondecarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int [] vib= nondecarray(arr);
        reverse(vib);
        print(vib);
    }
    static void print (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap (int [] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    static void reverse (int [] arr) {
        int i =0;
        int j =arr.length-1;
        while (i <j) {
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static int []  nondecarray (int [] arr) {
        int n = arr.length;
        int [] ans = new int [n];
        int j = 0;
        int left =0;
        int right = n-1;
        while (left<=right ) {
            if (Math.abs(arr[left]) >Math.abs(arr[right])) {
                ans [j++] = arr[left] * arr[left];
                left++;
            } else {
                ans [j++] = arr[right] * arr[right];
                right --;
            }
        }
        return ans;
    }

//    static int []  nondecarray (int [] arr) {
//        int n = arr.length; // Here we're just storing the length of input array for convenience
//        int [] ans = new int [n]; // Creating a new array of the same length as input array to store our answer
//        int j = n-1; // We're initiating a pointer 'j' at the last index of our new array
//        int left =0; // Creating a pointer 'left' at the start of input array
//        int right = n-1; // Creating another pointer 'right' at the end of input array
//
//        while (left<=right ) { // As long as 'left' is less than or equal to 'right', we will keep doing following operations
//            if (Math.abs(arr[left]) >Math.abs(arr[right])) { // If absolute value of element at 'left' is greater than absolute value at 'right'
//                ans [j--] = arr[left] * arr[left]; // We square the 'left' element and store it at position 'j' in our answer array and then decrease 'j'
//                left++; // We then increase 'left'
//            } else {
//                ans [j--] = arr[right] * arr[right]; // If not (i.e., 'right' element is larger), we square the 'right' element and store it at position 'j' and then decrease 'j'
//                right --; // We then decrease 'right'
//            }
//        }
//        return ans; // Once every element is processed (when 'left' > 'right'), we then return our sorted squared array
//    }

}
