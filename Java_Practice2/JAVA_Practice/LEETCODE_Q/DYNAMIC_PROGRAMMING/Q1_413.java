package LEETCODE_Q.DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class Q1_413 {
    public static int numberOfArithmeticSlices(int[] nums) {
        int[] dp = new int[nums.length];
        int ans=0;

        for (int i=2; i<nums.length; i++){
            if ( (nums[i]-nums[i-1]) == (nums[i-1]-nums[i-2]) ){
                dp[i] = dp[i-1]+1;
            }
        }
        for (int i=0; i<nums.length; i++){
            ans += dp[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,9,12,15,18,22,26,30,34,36,38,40,41};
        System.out.println("The array : "+ Arrays.toString(arr));
        System.out.println("Number of arithmetic slices are : "+numberOfArithmeticSlices(arr));
    }
}
