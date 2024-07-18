package matrix;

public class Q6 {
    public static void display(int mat[][]){
        int r=mat.length;
        int c=mat[0].length;
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(mat[i][j]+"  ");
            }
        System.out.println();
        }
    }
    public static int[][] trans_mtrx(int mat[][]){
        int r = mat.length;
        int c = mat[0].length;
        int[][] trans_matrix = new int[c][r];
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                trans_matrix[j][i] = mat[i][j];
            }
        }
        return trans_matrix;
    }
    public static void check(int[][] mat1,int[][] mat2){
        if (mat1.length == mat2[0].length){
            for (int i=0; i<mat1.length;i++){
                for (int j=0; j<mat1[i].length; j++){
                    if (mat1[i][j] == mat2[i][j]){
                        System.out.println("MATRICES ARE EQUAL");
                        break;
                    }
                    else {
                        System.out.println("MATRICES ARE NOT EQUAL");
                        break;
                    }
                }
            }
        }
        else {
            System.out.println("MATRICES CAN'T BE EVALUATED");
        }
    }
    public static void main(String[] args) {
        System.out.println("Write a Java program to check if a given matrix is symmetric");
        int matrx[][] = {{1,1,1},{1,2,3},{2,2,2}};
        display(matrx);
        int[][] trans_matrix = trans_mtrx(matrx);
        System.out.println("-----------------------");
        int r2 = trans_matrix.length;
        int c2 = trans_matrix[0].length;
        for (int i=0;i<r2;i++){
            for (int j=0; j<c2; j++){
                System.out.print(trans_matrix[i][j]+"  ");
            }
        System.out.println();
        }
        System.out.println("------------------");
        check(matrx,trans_matrix);
    }
}
