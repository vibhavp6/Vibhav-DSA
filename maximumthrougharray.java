public class maximumthrougharray {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i =0 ; i < number.length; i ++) {
            if ( number [i] > max) {
                max = number[i];
            }

            if (number [i] < min) {
                min = number [i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
