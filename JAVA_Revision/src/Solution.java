import java.util.Arrays;

class Solution {
    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Values : ["+nums[i]+", "+nums[j]+"]");
                    return new int[]{i, j};
                }
            }
        }// If no solution is found, return an empty array
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target = 20;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
