package LEETCODE_Q.Array;

public class Q9_1752 {
    public static boolean check(int[] nums) {
        int cnt=0;
        for (int i=0; i<nums.length-1; i++){
            if (nums[i]>nums[i+1]){
                cnt++;
            }
        }
        if (nums[nums.length-1]>nums[0]){
            cnt++;
        }
        return (cnt<=1);
    }
    public static void main(String[] args) {
//        int[] nums = {7,8,9,10,1,2,3,4,5};
        int[] nums = {2,1};
//        int[] nums = {1,1,1,1};
//        int[] nums = {9,8,7,6,5,4,2,1};
        System.out.println(check(nums));
    }
}
