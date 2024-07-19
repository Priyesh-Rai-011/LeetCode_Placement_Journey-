package LEETCODE_Q.Array;

import java.util.Arrays;

public class Q6_WiggleSequence {
    public static int wiggleMaxLength(int[] nums) {
        int inc_count = 0;
        int dec_count = 0;
        for (int i=1; i<nums.length; i++){
            if (nums[i] > nums[i-1]){
                inc_count = dec_count+1;
            }
            else if (nums[i] < nums[i-1]) {
                dec_count = inc_count+1;
            }
        }
        //The length of the wiggle sequence will be 1 more than the increasing/decreasing count
        return Math.max(inc_count,dec_count)+1;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,17,5,10,13,15,10,5,16,8};
        System.out.println("Teh array is : "+ Arrays.toString(nums));
        System.out.println("Length of max wiggle sequence : "+wiggleMaxLength(nums));
    }
}
