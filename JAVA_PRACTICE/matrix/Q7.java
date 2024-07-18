package matrix;

public class Q7 {
    public static boolean isUpper(int[][] mat){
        boolean check=true;
        if (mat.length != mat[0].length){check = false;}
        for (int i=1; i<mat.length; i++){
            for (int j=0; j<i; j++){
                if (mat[i][j] != 0){
                    check = false;
                }
            }
        }
        return check;
    }
    public static void main(String[] args) {
        System.out.println("Check if matrix is upper triangular or not");
        int [][] matrx = {{1,1,1,1},{0,2,3,4},{0,0,1,1},{0,0,0,9}};

        boolean isUpper = isUpper(matrx);
        if (isUpper = true){
            System.out.println("IT IS UPPER MATRIX");
        }
        if (isUpper=false){
            System.out.println("IT IS NOT UPPER MATRIX");
        }
    }
}
