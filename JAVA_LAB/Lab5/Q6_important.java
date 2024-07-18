package Lab5;
import java.util.Scanner;
public class Q6_important {
    static void sum_of_diagonals(int[][] matx, int n){
        int s1=0,s2=0;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i == j){
                    s1=s1+matx[i][j];
                }
                if (i+j == n-1){
                    s2=s2+matx[i][j];
                }
            }
        }
        System.out.println("Sum of elements in the principle diagonal is :"+s1);
        System.out.println("Sum of elements in the secondary diagonal is :"+s2);
    }
    public static void main(String[] args) {
        System.out.println("-- Sum of diagonal elements of a 3X3 matrix --");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");        int rows = sc.nextInt();
        System.out.print("Enter the no. of columns : ");        int columns = sc.nextInt();
        int[][] matrix =  new int[rows][columns];
        System.out.println("Enter the elements of the matrix : ");
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<3; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is as follows : ");
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<3; j++){
                System.out.print(matrix[i][j]+"  ");
            }            System.out.println();
        }
        sum_of_diagonals(matrix,3);
    }
}
