package LEETCODE_Q.Stack.Monotonic_Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q10_962_Max_Width_Ramp {
    public static int maxWidthRamp(int[] nums) {
        int n = nums.length;
        Deque<Integer> stk = new ArrayDeque<>();

        // Iterate from n-1 to 0 to build the stack of increasing indices
        for (int i = n - 1; i >= 0; i--) {
            if (stk.isEmpty() || nums[stk.peek()] <= nums[i]) {
                stk.push(i);
            }
        }
        System.out.println(stk);

        int res = 0;
        for (int i = 0; i < n; i++) {
//            System.out.println(i+" "+ stk.peek());
            while (!stk.isEmpty() && nums[stk.peek()] >= nums[i]) {
                res = Math.max(res, stk.pop() - i);
            }
        }
//        System.out.println();

        return res;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{9,8,1,0,1,9,4,0,4,1};
        System.out.println(maxWidthRamp(nums));
    }
}
