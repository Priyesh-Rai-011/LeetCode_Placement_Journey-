package LEETCODE_Q.Stack.MonotonicStack_Theory;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class T4_NextSmallerToRight {
    public static int[] NSEtoRight(int[] nums){
        int n= nums.length;
        Deque<Integer> stk = new ArrayDeque<>();
        int[] ans = new int[n];
//        Arrays.fill(ans,-1);

        for (int i=n-1; i>=0; i--){
            while (!stk.isEmpty() && stk.peek()>=nums[i]){
                stk.pop();
            }
            if (stk.isEmpty()){
                ans[i]=-1;
            }
//            else if (!stk.isEmpty() && stk.peek()<nums[i]) {
            else {
                ans[i] = stk.peek();
            }

            stk.push(nums[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4,5,68,90,98,75,33,2};
        System.out.println(Arrays.toString(NSEtoRight(nums)));
    }
}
