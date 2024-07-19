package LEETCODE_Q.Matrix;

public class Q2_1582 {
    public static int numSpecial(int[][] mat) {
        int m = mat.length;     int n = mat[0].length;
        int[] row_cnt = new int[m];
        int[] col_cnt = new int[n];

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                int v = mat[i][j];
                row_cnt[i] = row_cnt[i] + v;
                col_cnt[j] = col_cnt[j] + v;
            }
        }
        int count=0;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (mat[i][j] == 0){
                    continue;
                }
                else if (mat[i][j] == 1) {
                    if (row_cnt[i]==1 && col_cnt[j]==1){
                        count++;
                    }
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {

    }
}
