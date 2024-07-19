package LEETCODE_Q.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Q4_No_of_FairPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[]{0,1,7,3,4,5};
        System.out.println("Array is : "+Arrays.toString(nums));
        System.out.println("Enter upper and lower values : ");
        int upper = sc.nextInt();
        int lower = sc.nextInt();
        System.out.println("NUMBER OF FAIR PAIRS IN ARRAYS ARE : "+countFairPairs(nums,lower,upper));
    }
    static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            int j = search(nums, lower - nums[i], i + 1);
            int k = search(nums, upper - nums[i] + 1, i + 1);
            ans += k - j;
        }
        return ans;
    }

    static int search(int[] nums, int x, int left) {
        int right = nums.length;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (nums[mid] >= x) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
