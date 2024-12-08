package LEETCODE_Q.SubArrays.Questions;

public class Q1_2016_MaxDiff_Btw_IncreasingElements {
    public static int maximumDifference(int[] nums) {
        int diff=-1;
        for (int i=0; i< nums.length; i++){
            for(int j=0; j< nums.length; j++){
                if(nums[j]>nums[i]){
                    diff=Math.max(diff,nums[j]-nums[i]);
                }
            }
        }
        return diff;
    }
    public static void main(String[] args) {
        System.out.println(maximumDifference(new int[]{1,5,2,10}));
    }
}
