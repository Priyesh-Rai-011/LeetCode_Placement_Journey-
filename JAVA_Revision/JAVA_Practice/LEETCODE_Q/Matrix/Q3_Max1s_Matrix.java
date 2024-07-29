package LEETCODE_Q.Matrix;

import java.util.ArrayList;

public class Q3_Max1s_Matrix {
    public static int max1s(int[][] matrix){
        int sum = 0;
        int max=0;
        int row_index=-1;
//        ArrayList<Integer> ones = new ArrayList<>();
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                sum+=matrix[i][j];
            }
//            ones.add(sum);
//            max=Math.max(max, ones.get(i));
            if (sum>max){
                max=sum;
                row_index=i;
            }
            sum=0;
        }
//        System.out.println(ones);
        System.out.println(max);
        return row_index;
    }
    public static void main(String[] args) {
        int[][] matrix = {{0,0,1,1},{0,1,0,1},{1,1,1,1},{0,0,1,0}};
        System.out.println(max1s(matrix));
    }
}
