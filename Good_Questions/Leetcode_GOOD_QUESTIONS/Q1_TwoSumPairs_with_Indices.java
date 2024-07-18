//QUESTION LINK -->    https://leetcode.com/problems/two-sum/
package Leetcode_GOOD_QUESTIONS;
// Find all pairs of indices that sum up to a target value (2SPI) --> (TwoSumPairs_with_Indices)

//Given an array of integers nums and a target integer value,
// implement a function twoSum to find and return all pairs of indices from the array
// such that the corresponding elements at those indices sum up to the target.
// Each pair of indices should be represented as an array of two integers.
// If no such pairs exist, return an empty array.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1_TwoSumPairs_with_Indices {
    static int[][]twoSum(int[] nums, int target){
    // this function returns the indices of the element whose sum = target value
        List<int[]> pairs = new ArrayList<>();// integer array( int[] ) type of ArrayList
                                              // ==> to store both (index values)
        System.out.print("Values: [");
        for (int i=0; i< nums.length; i++){
            for (int j=i+1; j< nums.length; j++){
                if (nums[i] + nums[j] == target){
                    pairs.add(new int[]{i,j});//storing the indices of the elements --> whose sum = target
                    System.out.print("["+nums[i]+", "+nums[j]+"], ");
                }
            }
        }
        System.out.println("]");

        return pairs.toArray(new int[0][]);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{12,43,25,67,11,89,80,90,10,76,74,30,40,88};
        int target = 100;

        System.out.println("Index pair which sums up to the target : "+target);
        int[][] result = twoSum(arr,target);

        System.out.println("Indices: "+Arrays.deepToString(result));
//        System.out.println("values: "+Arrays.deepToString(result));
        System.out.println("---------------------------------------");
//        for (int[] pair : result){
//            System.out.println("Indices: "+ Arrays.toString(pair));
//        }
    }
}
//===========================================================================
//===========================================================================
//===========================================================================
//===========================================================================
//        Here's a step-wise solution for the given code:
// 1. Create an empty `List<int[]>` called `pairs` to store the pairs of indices that sum up to the target value.
// 2. Iterate over the array `nums` using a `for` loop with index variable `i` starting from 0 and ending at `nums.length - 1`.
// 3. Within the outer loop, use another nested `for` loop with index variable `j` starting from `i + 1` and ending at `nums.length - 1`. This ensures that we only consider unique pairs without repetition.
// 4. Inside the nested loop, check if the sum of `nums[i]` and `nums[j]` is equal to the target value.
// 5. If the sum is equal to the target, it means we have found a pair of indices that satisfy the condition. Add the indices as an array `[i, j]` to the `pairs` list using the `pairs.add(new int[]{i, j})` statement.
// 6. After the nested loop finishes, we have processed all possible pairs.
// 7. Convert the `pairs` list to a 2D array using `pairs.toArray(new int[0][])` and return it. This array contains all the pairs of indices whose elements sum up to the target.
// 8. In the `main` method or wherever the `twoSum` method is called, store the result in a 2D array.
// 9. Iterate over each pair of indices in the result array using an enhanced `for` loop.
// 10. For each pair of indices, perform the desired operation (e.g., printing or further processing).
//        By following these steps, you should be able to find all pairs of indices whose elements sum up to the target value using the given code.
