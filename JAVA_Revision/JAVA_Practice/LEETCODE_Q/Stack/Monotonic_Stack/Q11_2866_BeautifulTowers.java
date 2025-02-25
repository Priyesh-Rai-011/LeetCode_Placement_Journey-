package LEETCODE_Q.Stack.Monotonic_Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Q11_2866_BeautifulTowers {
    public static long maximumSumOfHeights(int[] heights) {
        int n = heights.length;
        long[] leftSum = new long[n], rightSum = new long[n]; // Sum of heights to the left & right of each index
        // Compute left bounds and sum using a monotonic stack
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                stack.pop();
            }
            int prevIndex = stack.isEmpty() ? -1 : stack.peek();
            leftSum[i] = (long) heights[i] * (i - prevIndex) + (prevIndex == -1 ? 0 : leftSum[prevIndex]);
            stack.push(i);
        }
        // Clear the stack for reuse
        stack.clear();
        // Compute right bounds and sum using a monotonic stack
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                stack.pop();
            }
            int nextIndex = stack.isEmpty() ? n : stack.peek();
            rightSum[i] = (long) heights[i] * (nextIndex - i) + (nextIndex == n ? 0 : rightSum[nextIndex]);
            stack.push(i);
        }

        System.out.println(Arrays.toString(leftSum));
        System.out.println(Arrays.toString(rightSum));
        // Calculate the maximum sum of heights
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, leftSum[i] + rightSum[i] - heights[i]); // Avoid double-counting the peak
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] heights = new int[]{6,5,3,9,2,7};
        System.out.println("The maximum sum of heights  : "+maximumSumOfHeights(heights));
    }
}
