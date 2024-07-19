package LEETCODE_Q.Array;

public class Q13_907_SumOfSubArrayMin {
    public static int sumSubarrayMins(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            int min = arr[i];
            for (int j=i; j<arr.length; j++){
                min = Math.min(min,arr[j]);
                sum += min;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }
}
