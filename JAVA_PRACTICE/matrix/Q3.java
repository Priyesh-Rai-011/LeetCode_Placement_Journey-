package matrix;
import java.lang.Exception.*;
public class Q3 {
    public static void display(int mat[][]){
        for (int i=0; i<mat.length; i++){
            for (int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }System.out.println();
        }
        System.out.println("---------------------");
    }
    public static void sum(int mat1[][]){
        int r1=mat1.length; int c1=mat1[0].length;
//        int r2=mat2.length; int c2=mat2[0].length;
        int sum1=0,sum2=0;
        for (int i=0; i<r1; i++){
            for (int j=0; j<c1; j++){
                if (i == j){
                    sum1=sum1+mat1[i][j];
                }
                if((i+j) == (mat1.length-1)){
                    sum2 = sum2+mat1[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal element is : "+sum1);
        System.out.println("Sum of reverse diagonal element is : "+sum2);
    }
    public static void main(String[] args) {
        System.out.println("Write a Java program to find the sum of the diagonal elements of a matrix");
        int[][] matx1 = {{1,1,1,1},{1,2,3,4},{2,2,2,2}};
        int[][] matx2 = {{2,2,2,2},{1,2,3,4},{3,3,3,3}};

        display(matx1);
        display(matx2);

        System.out.println("---------Sum of diagonal elements-------------");
        sum(matx1);
        System.out.println("---------------");
        sum(matx2);
    }
}
