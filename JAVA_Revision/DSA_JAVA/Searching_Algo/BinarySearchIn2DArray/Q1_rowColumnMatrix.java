package Searching_Algo.BinarySearchIn2DArray;

import java.util.Arrays;

//      Suppose that the matrix is sorted in row and column manner
//      OTHER NAME -->  ROW-COLUMN MATRIX
//  l         u
//  10 20 30 40
//  11 25 35 45
//  28 29 37 49
//  33 34 38 50    target --> 37
public class Q1_rowColumnMatrix {
    public static void main(String[] args) {
        System.out.println("Binary Search In 2D Array (  ROW - COLUMN Matrix  )");
        int[][] matx = new int[][]{
                {10,20,30,40},
                {11,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(matx,37)));
    }
    static int[] search(int[][] matrix, int target){
        int r=0,    c=matrix.length-1;

        while (r<matrix.length && c>=0){
            if (matrix[r][c] == target){
                return new int[]{r,c};
            }
            if (matrix[r][c] < target){
                r++;
            }
            else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
