package Searching_Algo.BinarySearchIn2DArray;
// suppose we have this matrix
//   1 ,  2 ,  3 ,  4,
//   5 ,  6 ,  7 ,  8,
//   9 , 10 , 11 , 12,
//  13 , 14 , 15 , 16
public class Q2_sortedMatrix {
    public static void main(String[] args) {
        System.out.println("Searching in sorted Matrix");
        int[][] matx = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
    }
    // searching between the row provided
    static int[] bs(int[][] matrix , int row , int cStart, int cEnd, int target){
        while (cStart <= cEnd){
            int mid = cStart + (cEnd-cStart)/2;
            if (matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid+1;
            }
            else {
                cEnd = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
