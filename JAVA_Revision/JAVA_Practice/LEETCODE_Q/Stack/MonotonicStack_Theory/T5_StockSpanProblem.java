package LEETCODE_Q.Stack.MonotonicStack_Theory;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class T5_StockSpanProblem {
    public static int[] StkSpn(int[] nums){
        int[] ans = new int[nums.length];
        Deque<Integer> stk = new ArrayDeque<>();
        for (int i=0; i< nums.length; i++){
            while (!stk.isEmpty() && nums[stk.peek()]<=nums[i]){
                stk.pop();
            }
            ans[i] = (stk.isEmpty()) ? (i+1) : (i- stk.peek());
            stk.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] stocks = new int[]{100,80,60,70,60,75,85};
        System.out.println("The array is : "+ Arrays.toString(stocks));
        System.out.println(Arrays.toString(StkSpn(stocks)));
    }
}
