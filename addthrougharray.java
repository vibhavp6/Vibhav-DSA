public class addthrougharray {
    public static void main(String[] args) {
        int [] arr = {0,1,1,1,2};
        int sum = 0;
        for (int i = 0; i <arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
