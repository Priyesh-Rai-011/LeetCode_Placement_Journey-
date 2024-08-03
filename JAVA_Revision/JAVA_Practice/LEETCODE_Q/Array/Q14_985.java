package LEETCODE_Q.Array;

import java.util.Arrays;

public class Q14_985 {
//    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
//        int n = nums.length;
//        int[] result = new int[queries.length];
//
//        for (int i = 0; i < queries.length; i++) {
//            int val = queries[i][0];
//            int index = queries[i][1];
//
//            nums[index] += val;
//
//            int evenSum = 0;
//            for (int num : nums) {
//                if (num % 2 == 0) {
//                    evenSum += num;
//                }
//            }
//
//            result[i] = evenSum;
//        }
//
//        return result;
//    }
    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] result = new int[nums.length];
        int sum=0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        int j=0;
        for (int[] query : queries) {
            int idx = query[1];
            int val = query[0];
            if (nums[idx] % 2 == 0) {
                sum -= nums[idx];
            }
            nums[idx] += val;
            if (nums[idx] % 2 == 0) {
                sum += nums[idx];
            }
            result[j++]=sum;
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[][] queries = {{1, 0},
                           {-3,1},
                           {-4,0},
                           {2, 3}};

        System.out.println(Arrays.toString(sumEvenAfterQueries(nums, queries)));
    }
}
