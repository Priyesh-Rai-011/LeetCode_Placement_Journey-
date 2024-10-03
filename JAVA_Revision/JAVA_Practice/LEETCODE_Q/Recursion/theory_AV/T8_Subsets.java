package LEETCODE_Q.Recursion.theory_AV;

import java.util.ArrayList;
import java.util.List;

public class T8_Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> currentSubset = new ArrayList<>();
        generateSubsets(nums, 0, ans, currentSubset);
        return ans;
    }

    private static void generateSubsets(int[] nums, int index, List<List<Integer>> ans, List<Integer> currentSubset) {
        // Add the current subset to the answer
        ans.add(new ArrayList<>(currentSubset));

        // Explore further subsets
        for (int i = index; i < nums.length; i++) {
            currentSubset.add(nums[i]);
            generateSubsets(nums, i + 1, ans, currentSubset);
            currentSubset.remove(currentSubset.size() - 1); // Backtrack
        }
    }
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
    }
}