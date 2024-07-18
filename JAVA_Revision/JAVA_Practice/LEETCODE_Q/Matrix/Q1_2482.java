package LEETCODE_Q.Matrix;

import java.util.Arrays;

public class Q1_2482 {
    public static int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] rows = new int[m];
        int[] cols = new int[n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                int v = grid[i][j];
                rows[i] += v;
                cols[j] += v;
            }
        }
        int[][] diff = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                diff[i][j] = rows[i] + cols[j] - (n - rows[i]) - (m - cols[j]);
            }
        }
        return diff;
    }
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{0,1,1},{1,0,1},{0,0,1}};
        System.out.println(Arrays.deepToString(onesMinusZeros(arr1)));
    }
}
