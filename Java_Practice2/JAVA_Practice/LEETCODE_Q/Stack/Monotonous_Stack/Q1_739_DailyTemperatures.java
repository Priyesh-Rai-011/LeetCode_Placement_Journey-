package LEETCODE_Q.Stack.Monotonous_Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Q1_739_DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>(); // a decreasing stack

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int index = stack.pop();
                System.out.println(index);
                ans[index] = i - index;
            }
            stack.push(i);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] temp = new int[]{73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temp)));
    }
}
