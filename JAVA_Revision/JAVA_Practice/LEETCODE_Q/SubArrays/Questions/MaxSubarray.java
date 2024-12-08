package LEETCODE_Q.SubArrays.Questions;

public class MaxSubarray {
    public static int maxSubArray(int[] nums) {
        // Kadane's Algorithm
        int sum = 0;
        int maxi = nums[0];
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];      // step 1

            maxi = Math.max(maxi,sum);// step 2

            if(sum<0){sum = 0;}       // step 3
        }
        return maxi;
    }
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{3,4,-5,8,-12,7,6,-2}));
    }
}
