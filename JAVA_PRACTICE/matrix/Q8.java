package matrix;

public class Q8 {
    public static void display(int[][] mat){
        for (int i=0; i<mat.length; i++){
            for (int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static boolean check(int[][] mat){
        boolean check = true;
        for (int i=0; i<mat.length; i++){
            for (int j=0; j<mat[0].length; j++){
                if (i==j){
                    if (mat[i][j] == 0){
                        check = false;
                    }
                }
            }
        }
        return check;
    }
    public static void main(String[] args) {
        System.out.println("Write a Java program to check if a given matrix is diagonal.");
        int[][] matrx = {{1,0,0},{0,2,0},{0,0,2}};
        display(matrx);
        boolean isdiagonal = check(matrx);
        System.out.println(isdiagonal);
    }
}
