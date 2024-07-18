package Leetcode_GOOD_QUESTIONS;

import java.util.Arrays;

public class Q5_2348_zeroFilledSubarray {
    public static long zeroFilledSubarray(int[] nums) {
        long count = 0; // Keeps track of current zero subarray length
        long ans = 0;    // Stores total number of zero subarrays

        for (int num : nums) {
            count = (num == 0) ? (count + 1) : 0; // Increment count if current element is 0, reset to 0 otherwise
            ans += count;                       // Add current count to total subarrays (since count represents the length of the current zero subarray)
        }

        return ans;
    }
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
