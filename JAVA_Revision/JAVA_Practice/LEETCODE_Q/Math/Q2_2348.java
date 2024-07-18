package LEETCODE_Q.Math;

import java.util.Arrays;

public class Q2_2348 {
    public static long zeroFilledSubarray(int[] nums) {
        long count = 0; // Keeps track of current zero subarray length
        long ans = 0;    // Stores total number of zero subarrays

        for (int num : nums) {
            count = (num == 0) ? (count + 1) : 0; // Increment count if current element is 0, reset to 0 otherwise
            ans += count;                       // Add current count to total subarrays (since count represents the length of the current zero subarray)
        }

        return ans;
    }

//    public static long zeroFilledSubarray(int[] nums) {
//        long ans=0;
//        int[] dp = new int[nums.length];
//        for (int i=1; i<nums.length; i++){
//            if (nums[i]==0){
//                if (nums[0]==0){
//                    dp[0]=1;
//                }
//                dp[i] = dp[i-1]+1;
//            }
//        }
//        for (int i=0; i< dp.length; i++){
//            ans+=dp[i];
//        }
//        System.out.println(Arrays.toString(dp));
//        return ans;
//    }
    public static void main(String[] args) {
        int[] arr = {1,3,0,0,0,2,0,0,4};
        int[] arr2 = {0,1,3,0,0,0,2,0,0,4};
        System.out.println("The array is : "+ Arrays.toString(arr));
        System.out.println(zeroFilledSubarray(arr));
        System.out.println("----------------");
        System.out.println("The array is : "+ Arrays.toString(arr2));
        System.out.println(zeroFilledSubarray(arr2));
    }
}
