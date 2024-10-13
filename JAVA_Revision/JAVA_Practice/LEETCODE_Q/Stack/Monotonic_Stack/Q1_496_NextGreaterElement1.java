package LEETCODE_Q.Stack.Monotonic_Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Q1_496_NextGreaterElement1 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> stk = new ArrayDeque<>();
        int j=0;
        for (int i=nums2.length-1; i>=0; i--){

            while (!stk.isEmpty() && stk.peek()<=nums2[i]){
                stk.pop();
            }
            if (!stk.isEmpty() && stk.peek()>nums2[i]){
                nums1[j++ ]=nums2[i];
            }
            if (stk.isEmpty()){
                nums1[j++]=-1;
            }
            stk.push(nums2[i]);
        }
        return nums1;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2})));
    }
}
