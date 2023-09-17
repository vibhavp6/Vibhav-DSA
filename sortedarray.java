import java.util.Scanner;

public class sortedarray {
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
        sorted(arr);
        System.out.println("sorted array");
        print(arr);
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

    static void sorted(int [] arr)
    {
        int n = arr.length;
        int countZeros = 0;
        // counting the number of zeros
        for (int i = 0 ; i <n; i++)
        {
            if (arr[i] == 0)
            {
                countZeros++;
            }
        }
        // Filling the array
        for (int i = 0; i<n; i++)
        {
            if(i < countZeros) // fill the first 'countZeros' block with 0s
            {
                arr[i] = 0;
            }
            else // rest with 1s
            {
                arr[i] = 1;
            }
        }
    }
}
