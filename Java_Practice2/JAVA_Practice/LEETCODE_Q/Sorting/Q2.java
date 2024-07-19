package LEETCODE_Q.Sorting;

import java.util.Arrays;

//  Q Link : https://leetcode.com/problems/largest-number-at-least-twice-of-others/
//  Leet-code 747
//  You are given an integer array nums where the largest integer is unique.
//  Determine whether the largest element in the array is at least twice as much as every other number in the array.
//  If it is, return the index of the largest element, or return -1 otherwise.
//Example 1:
//  Input: nums = [3,6,1,0]
//  Output: 1
//  Explanation: 6 is the largest integer.
//Example 2:
//  Input: nums = [1,2,3,4]
//  Output: -1
//  Explanation: 4 is less than twice the value of 3, so we return -1.
public class Q2 {
    public static int dominantIndex(int[] nums) {
        int indx,k=0;
        for (int i=0; i< nums.length; i++){
            if (nums[k]<nums[i]){
                k=i;
            }
        }
        for (int i=0; i< nums.length; i++){
            if (k!=i && (nums[k] < 2*nums[i])){
                return -1;
            }
        }
        return k;
    }
    public static void main(String[] args) {
//        int[] nums = new int[]{7,8,9,6,7,2,1};
        int[] nums = new int[]{7,8,9,6,7,20,2,1};
        System.out.println("The array : "+ Arrays.toString(nums));
        System.out.println(dominantIndex(nums));
    }
}
