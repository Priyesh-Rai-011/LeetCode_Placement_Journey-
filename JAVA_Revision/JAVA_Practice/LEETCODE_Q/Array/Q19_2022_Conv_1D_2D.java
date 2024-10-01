package LEETCODE_Q.Array;

import java.util.Arrays;

public class Q19_2022_Conv_1D_2D {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] res = new int[m][n];
        if ((m*n) != original.length){
            return new int[0][0];
        }
        int k=0;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                res[i][j] = original[k];
                k++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8};
        int[][] res = construct2DArray(nums,2,4);
        System.out.println(Arrays.deepToString(res));
    }
}
