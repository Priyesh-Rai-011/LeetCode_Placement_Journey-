package LEETCODE_Q.SlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_713 {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k<=1){return 0;}
        int ans=0,prod=1;

        for (int l=0,r=0; r<nums.length; r++){
            prod = prod * nums[r];
            while (prod >= k){
                prod = prod/nums[l++];
            }
            ans = ans+(r-l+1);
        }
//        System.out.println(Arrays.toString(nums));
//        System.out.println(prod);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] nums = {10,5,2,6};
//        int[] nums = {1,2,3};
        int[] nums = {10,9,10,4,3,8,3,3,6,2,10,10,9,3};
        System.out.println("The array is : "+Arrays.toString(nums));
        System.out.print("Enter the product : ");  int prod = sc.nextInt();
        System.out.println(numSubarrayProductLessThanK(nums,prod));
    }
}
