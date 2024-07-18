package Arrays;

import java.util.ArrayList;

// LeetCode Q link : https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/description/
//  Given an integer array nums of positive integers, return the average value of all even integers that are divisible by 3.
//  Example 1:  Input: nums = [1,3,6,10,12,15]
//              Output: 9
//              Explanation: 6 and 12 are even numbers that are divisible by 3. (6 + 12) / 2 = 9.
//  Example 2:  Input: nums = [1,2,4,7,10]
//              Output: 0
//              Explanation: There is no single number that satisfies the requirement, so return 0.
public class Q1_sumOfEven_divisible_by_3 {
    public static void main(String[] args) {
        int[] array = new int[]{1,3,6,10,12,15};
        System.out.println("Average of the even elements divisible by 3 is : "+averageValue(array));
    }
    static int averageValue(int[] nums) {
        ArrayList<Integer> n = new ArrayList<>();
        int avg=0;
        for (int i=0; i<nums.length; i++){
            if(nums[i]%3 == 0 && nums[i]%2 == 0){
                n.add(nums[i]);
            }
        }
    // numbers which are even and divisible by 3   
        System.out.println("Numbers : "+n);
    // finding average of the numbers
        if (n.isEmpty()) {
            return 0; // Avoid division by zero
        }
        int sum = 0;
        for (int number : n) {
            sum += number;
        }
        avg = (int) sum/n.size();
        return avg;
    }
}
