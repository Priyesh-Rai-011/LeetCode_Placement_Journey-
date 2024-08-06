package LEETCODE_Q.Math;

import java.util.Arrays;

public class Q11 {
    public static int differenceOfSum(int[] nums) {
        int elementSum=0, digitSum=0;
        for (int i=0; i<nums.length; i++){
            elementSum+=nums[i];
//            int n=nums[i];
            while (nums[i]>9){
                digitSum+=nums[i]%10;
                nums[i]/=10;
            }
            digitSum+=nums[i];
        }
        return Math.abs(elementSum-digitSum);
    }
    public static void main(String[] args) {
        System.out.println(differenceOfSum(new int[]{1, 15, 6, 3}));
        System.out.println(differenceOfSum(new int[]{1, 2, 3, 4}));
    }
}
