package LEETCODE_Q.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static int findFinalValue(int[] nums, int original) {
        return findFinalValueRecursive(nums, original, 0);
    }

    public static int findFinalValueRecursive(int[] nums, int original, int index) {
        if (index >= nums.length) {
            return original;
        }

        if (nums[index] == original) {
            return findFinalValueRecursive(nums, original * 2, 0);
        }

        return findFinalValueRecursive(nums, original, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{20,32,16,2,5,4,8,9,10,11};
        Scanner sc = new Scanner(System.in);
        System.out.println("Array is : "+ Arrays.toString(arr));
        System.out.print("Enter the original number : ");
        int org = sc.nextInt();
        System.out.println(findFinalValue(arr,org));
    }
}
