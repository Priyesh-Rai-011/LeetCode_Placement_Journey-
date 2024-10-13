package LEETCODE_Q.Stack.Monotonic_Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Q3_1944_VisiblePeople_Queue {
    public static int[] canSeePersonsCount(int[] heights) {
        Deque<Integer> stk = new ArrayDeque<>();
        int n= heights.length;
        int[] ans = new int[n];
        for (int i=n-1; i>=0; i--){
            int cnt=0;
            while (!stk.isEmpty() && stk.peek()<heights[i]){
                stk.pop();
                cnt++;
            }
            //when stack is not empty
            //iven if the largest height is not popped out
            //the current person can see that height to it's right
            boolean add = !stk.isEmpty();
            int intadd = add ? 1 : 0;//that's why it(1) is added to the answer
            ans[i] = (i==n-1) ? 0 : cnt+intadd;
            stk.push(heights[i]);
        }
//        System.out.println(stk);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(canSeePersonsCount(new int[]{10, 6, 8, 5, 11, 9})));
    }
}
