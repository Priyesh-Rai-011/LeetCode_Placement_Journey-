//package matrix;

public class a_a {
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
    public static void prod(int mat[][]){
        int r=mat.length;
        int c=mat[0].length;
        int prod1=1,    prod2=1;
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                if (i==j){             prod1 = prod1 * mat[i][j];}
                if ((i+j) == (r-1)){   prod2 = prod2 * mat[i][j];}
            }
        }
        System.out.println("Product of diagonal element is : "+prod1);
        System.out.println("Product of reverse diagonal element is : "+prod2);
    }
    public static void main(String[] args) {
        System.out.println("Write a Java program to find the product of the diagonal elements of a matrix.");
        int matx1[][] = {{1,1,1},{1,2,3},{2,2,2}};
        int matx2[][] = {{2,2,2},{1,2,3},{3,3,3}};

        display(matx1);
//        display(matx2);
        System.out.println("----------------------------");
        prod(matx1);
//        prod(matx2);
    }
}
