package LEETCODE_Q.HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1_TwoSum {
    public static int[] twosum(int[] nums, int target){
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0;; ++i) {
            if (d.containsKey(target-nums[i])) {
                return new int[] {d.get(target-nums[i]), i};
            }
            d.put(nums[i], i);
        }
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twosum(new int[]{1,2,3,4,5,6},7)));
    }
}
