package LEETCODE_Q.Stack.MonotonicStack_Theory;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class T6_LargestRectangleInHistogram {
//      ================      MY APPROACH     ==================
//    public static int largestRectangleArea(int[] heights) {
//        int n=heights.length,area=0;
//        Deque<Integer> stk_nsl = new ArrayDeque<>();
//        int[] nsl_arr = new int[n];
//        for (int i=0; i<n; i++){
//            while (!stk_nsl.isEmpty() && heights[stk_nsl.peek()] >= heights[i]){
//                stk_nsl.pop();
//            }
//            if (stk_nsl.isEmpty()){
//                nsl_arr[i]=i+1;
//            }
//            else if (heights[stk_nsl.peek()] < heights[i]) {
//                nsl_arr[i] = i-stk_nsl.peek();
//            }
//            stk_nsl.push(i);
//        }
//        System.out.println(Arrays.toString(nsl_arr));
//
//        Deque<Integer> stk_nsr = new ArrayDeque<>();
//        int[] nsr_arr = new int[heights.length];
//        for (int i=n-1; i>=0; i--){
//            while (!stk_nsr.isEmpty() && heights[stk_nsr.peek()] >= heights[i]){
//                stk_nsr.pop();
//            }
//            if (stk_nsr.isEmpty()){
//                nsr_arr[i] = n-i;
//            }
//            else if (!stk_nsr.isEmpty() && heights[stk_nsr.peek()] < heights[i]) {
//                nsr_arr[i] = stk_nsr.peek()-i;
//            }
//            stk_nsr.push(i);
//        }
//        System.out.println(Arrays.toString(nsr_arr));
//        for (int i=0; i<n; i++){
//            area=Math.max(area, heights[i]*(nsl_arr[i]+nsr_arr[i]-1));
//        }
//        return area;
//    }



//      ================      INTERNET'S APPROACH     ==================

    private static int largestRectangleArea(int[] heights) {
        int res = 0, n = heights.length;
        Deque<Integer> stk = new ArrayDeque<>();
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(right, n);
        for (int i = 0; i < n; ++i) {
            while (!stk.isEmpty() && heights[stk.peek()] >= heights[i]) {
                right[stk.pop()] = i;
            }
            left[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
        System.out.println(Arrays.toString(right));
        System.out.println(Arrays.toString(left));
        for (int i = 0; i < n; ++i) {
            res = Math.max(res, heights[i] * (right[i] - left[i] - 1));
        }
        return res;
    }
    public static void main(String[] args) {
        int[] heights = new int[]{6,2,5,4,5,1,6};
        System.out.println("The heights of the histograms are : \n"+ Arrays.toString(heights));

        System.out.println(largestRectangleArea(heights));
    }
}
