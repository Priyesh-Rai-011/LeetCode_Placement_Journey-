package LEETCODE_Q.Stack.MonotonicStack_Theory;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class T2_NextLargestToLeft {
    public static int[] NLEtoLeft(int[] nums){
        int n= nums.length;
        Deque<Integer> stk = new ArrayDeque<>();
        int[] ans = new int[n];

        for (int i=0; i<n ; i++){
            while (!stk.isEmpty() && stk.peek()<=nums[i]){
                stk.pop();
            }

            if (stk.isEmpty()){//if stack is empty - return -1 to that index
                ans[i]=-1;
            }
            else if (!stk.isEmpty() && stk.peek()>nums[i]){// if element in top of stack >  element in tha nums array
                                        // return the element to the array
                ans[i]=stk.peek();
            }
            stk.push(nums[i]);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{10,3,7,2};
        System.out.println(Arrays.toString(NLEtoLeft(nums)));
    }
}
