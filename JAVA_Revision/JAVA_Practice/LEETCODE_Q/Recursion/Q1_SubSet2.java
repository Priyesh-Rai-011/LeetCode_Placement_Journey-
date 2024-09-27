package LEETCODE_Q.Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q1_SubSet2 {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> currentSubset = new ArrayList<>();
        generateSubsets(nums, 0, ans, currentSubset);

        List<List<Integer>> uniqueLists = removeDuplicates(ans);

        return uniqueLists;
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

    private static List<List<Integer>> removeDuplicates(List<List<Integer>> listOfLists) {
        // Use a HashSet to store unique lists
        Set<List<Integer>> set = new HashSet<>(listOfLists);
        // Convert the set back to a list
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        System.out.println(subsetsWithDup(new int[]{1,2,2}));
    }
}
