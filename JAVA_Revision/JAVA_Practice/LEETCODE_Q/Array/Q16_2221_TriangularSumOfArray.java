package LEETCODE_Q.Array;

//import java.util.Arrays;

public class Q16_2221_TriangularSumOfArray {
    public static int triangularSum(int[] nums) {
        int count=0, n= nums.length;
//        System.out.println(Arrays.toString(nums));
        while (count<n-1){
            for (int j=0; j<(n-count-1);j++){
                nums[j] = (nums[j]+nums[j+1])%10;
            }
            count++;
//            System.out.println(Arrays.toString(nums));
        }
//        System.out.println(Arrays.toString(nums));
        return nums[0];
    }
    public static void main(String[] args) {
        System.out.println(triangularSum(new int[]{1,2,3,4,5}));
    }
}
