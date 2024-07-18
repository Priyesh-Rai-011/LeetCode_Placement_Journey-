package matrix;
import java.util.Scanner;
public class Q1 {
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int r1 = matrix1.length;
        int c1 = matrix1[0].length;
        int r2 = matrix2.length;
        int c2 = matrix2[0].length;
        if (c1 != r2){
            throw new IllegalArgumentException("EXCEPTION : MATRIX cant be MULTIPLIED ...!");
        }
        int result_matrx[][] = new int[r1][c2];
//        else {
//        }

        return matrix1;
    }

    public static void main(String[] args) {
        System.out.println("multiply 2 matrix");
        int matrx1[][] = {{1,2,3},{1,1,1},{2,2,2},{1,1,1}};
        int matrx2[][] = {{1,2,3},{1,1,1},{2,2,2}};

        System.out.println(matrx2.length);
        System.out.println(matrx2[0].length);
    }
}
