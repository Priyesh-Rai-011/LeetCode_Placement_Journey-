package LEETCODE_Q.Array;

import java.util.Arrays;

public class Q8_ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
       int[] ans = new int[nums.length];
       int[] prefix = new int[nums.length];
       int[] suffix = new int[nums.length];

       prefix[0]=1;
       for (int i=1; i<nums.length; i++){
           prefix[i] = prefix[i-1] * nums[i-1];
       }
       suffix[nums.length-1]=1;
       for (int i= nums.length-2; i>=0; i--){
           suffix[i] = suffix[i+1] * nums[i+1];
       }
//        System.out.println(Arrays.toString(prefix));
//        System.out.println(Arrays.toString(suffix));
        for (int i=0; i<nums.length; i++){
            ans[i] = suffix[i] * prefix[i];
        }

       return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
//        int[] arr = {0,0};
//        int[] arr = {-1,1,0,-3,3};

        System.out.println("The array is : "+ Arrays.toString(arr));
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
