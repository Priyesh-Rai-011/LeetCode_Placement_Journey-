package LEETCODE_Q.DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class Q2_2110 {
//    public static long getDescentPeriods(int[] prices) {
////        long count = prices.length; // Keeps track of current zero subarray length
//        long ans = 0;    // Stores total number of zero subarrays
//
////        for (int num : prices) {
////            count = (num == -1) ? (count + 1) : 0; // Increment count if current element is 0, reset to 0 otherwise
////            ans += count;                       // Add current count to total subarrays (since count represents the length of the current zero subarray)
////        }
//        int[] dp = new int[prices.length];
//        Arrays.fill(dp,1);
//        for (int i=1; i<prices.length; i++){
//
//            if (prices[i] == prices[i+1]+1){
//                if (prices[0] == prices[1]+1 ){
//                    dp[1]=dp[0]+1;
//                }
////                else if (prices[prices.length-2]==prices[prices.length-1]+1) {
////                    dp[prices.length-1]=dp[prices.length-2]+1;
////                }
//                dp[i] = dp[i-1]+1;
//            }
//        }
//        System.out.println(Arrays.toString(dp));
//        for (int i=0; i<dp.length; i++){
//            ans = ans+dp[i];
//        }
//        return ans;
//    }
public static long getDescentPeriods(int[] prices) {
    long count=0,ans=0;
    for (int i=1; i<prices.length; i++){
        count = (prices[i]-prices[i-1] == -1) ? (count+1) : 0;
        ans+=count;
    }
    return ans+prices.length;
}

    public static void main(String[] args) {
//        int[] arr = new int[]{8,6,7,7,3,2,1,4};
        int[] arr = new int[]{9,8,6,7,7,3,2,1,4};
//        int[] arr = new int[]{3,2,1,4};
        System.out.println("The array is : "+ Arrays.toString(arr));

        System.out.println(getDescentPeriods(arr));
    }
}
