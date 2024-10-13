package LEETCODE_Q.Stack.Monotonic_Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Q5_1475_FinalPrices {
    static int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        Arrays.fill(result,0);
//        Finding next smallest element to right
        Deque<Integer> stk = new ArrayDeque<>();
        for (int i=prices.length-1; i>=0; i--){
            while (!stk.isEmpty() && stk.peek()>prices[i]){
                stk.pop();
            }
            if    (!stk.isEmpty() && stk.peek()<prices[i]){
                result[i] = prices[i]-stk.peek();
            }
            if(stk.isEmpty()){
                result[i] = prices[i];
            }
            stk.push(prices[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(finalPrices(new int[]{8,4,6,2,3})));
        System.out.println(Arrays.toString(finalPrices(new int[]{1,2,3,4,5})));
        System.out.println(Arrays.toString(finalPrices(new int[]{10,1,1,6})));
    }
}
