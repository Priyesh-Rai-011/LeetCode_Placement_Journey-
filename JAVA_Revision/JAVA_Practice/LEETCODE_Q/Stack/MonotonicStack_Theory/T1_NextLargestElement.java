package LEETCODE_Q.Stack.MonotonicStack_Theory;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;


public class T1_NextLargestElement {
    public static int[] NGE(int[] arr) {
        int n = arr.length;
        Deque<Integer> st = new ArrayDeque<>();
        int[] ans = new int[n];

        // Iterate over the given array
        for(int i = n - 1; i>= 0; i--){

            // While stack is not empty and the current element is greater than the top of the stack,
            // keeping removing the top of the stack
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
//                st.pollLast();
            }
            // If the stack is empty, then it mean there is no next greater
            // element for this element
            if(st.isEmpty()){        ans[i] = -1;        }
            // Otherwise, the top of the stack is the next greater
            // element for this element
            else if(st.peek()>arr[i])            {   ans[i] = st.peek();      }
            // Push the current element to the stack
            st.push(arr[i]);
//            st.offerLast(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,2,4};
        System.out.println(Arrays.toString(NGE(nums)));
    }
}
