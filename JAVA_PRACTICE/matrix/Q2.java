package matrix;
import java.util.Scanner;


public class Q2 {
    public static int[][] trans(int mat[][]){
        int row = mat[0].length;
        int col = mat.length;
        int trans_matx[][] = new int[row][col];
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                trans_matx[j][i] = mat[i][j];
            }
        }
        return trans_matx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----  transpose of a matrix  ----");
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
        int[][] trans_matx = trans(matrx);
        for (int i=0; i<trans_matx.length; i++){
            for (int j=0; j<trans_matx[0].length; j++){
                System.out.print(trans_matx[i][j]);
            }
            System.out.println();
        }
    }
}
