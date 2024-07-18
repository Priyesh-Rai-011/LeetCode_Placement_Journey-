package Leetcode_GOOD_QUESTIONS;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q7_85_MaxAreaRectangle_BinaryMatrix {

    public static int maximalRectangle(char[][] matrix) {
        int n = matrix[0].length;
        int[] heights = new int[n];
        int ans = 0;
        for (var row : matrix) {
            for (int j = 0; j < n; ++j) {
                if (row[j] == '1') {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
            }
//            System.out.println(Arrays.toString(heights));
            ans = Math.max(ans, largestRectangleArea(heights));
        }
        return ans;
    }
    private static int largestRectangleArea(int[] heights) {
        int n=heights.length,area=0;
        Deque<Integer> stk_nsl = new ArrayDeque<>();
        int[] nsl_arr = new int[n];
        for (int i=0; i<n; i++){
            while (!stk_nsl.isEmpty() && heights[stk_nsl.peek()] >= heights[i]){
                stk_nsl.pop();
            }
            if (stk_nsl.isEmpty()){
                nsl_arr[i]=i+1;
            }
            else if (heights[stk_nsl.peek()] < heights[i]) {
                nsl_arr[i] = i-stk_nsl.peek();
            }
            stk_nsl.push(i);
        }
//        System.out.println(Arrays.toString(nsl_arr));

        Deque<Integer> stk_nsr = new ArrayDeque<>();
        int[] nsr_arr = new int[heights.length];
        for (int i=n-1; i>=0; i--){
            while (!stk_nsr.isEmpty() && heights[stk_nsr.peek()] >= heights[i]){
                stk_nsr.pop();
            }
            if (stk_nsr.isEmpty()){
                nsr_arr[i] = n-i;
            }
            else if (!stk_nsr.isEmpty() && heights[stk_nsr.peek()] < heights[i]) {
                nsr_arr[i] = stk_nsr.peek()-i;
            }
            stk_nsr.push(i);
        }
//        System.out.println(Arrays.toString(nsr_arr));
        for (int i=0; i<n; i++){
            area=Math.max(area, heights[i]*(nsl_arr[i]+nsr_arr[i]-1));
        }
        return area;
    }
    public static void main(String[] args) {
        System.out.println(maximalRectangle(new char[][]{
                                      {'1','0','1','0','0'},
                                      {'1','0','1','1','1'},
                                      {'1','1','1','1','1'},
                                      {'1','0','0','1','0'}})
        );
    }
}
