package matrix;
import java.util.Scanner;

public class Q2_2 {
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;        int columns = matrix[0].length;
        int[][] transpose = new int[columns][rows];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : "); int r = sc.nextInt();
        System.out.print("Enter the number of columns : "); int c = sc.nextInt();
        int matrx[][] = new int[r][c];
        System.out.println("Enter the elements in the matrix : ");
        for (int i=0; i<matrx.length; i++){
            for (int j=0; j<matrx[0].length; j++){
                matrx[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is : ");
        for (int i=0; i<matrx.length; i++){
            for (int j=0; j<matrx[0].length; j++){
                System.out.print(matrx[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        System.out.println("Transpose of the Matrix is : ");
        int[][] transpose = transposeMatrix(matrx);

        // Print the transpose matrix
        for(int i=0; i<transpose.length; i++) {
            for(int j=0; j<transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
