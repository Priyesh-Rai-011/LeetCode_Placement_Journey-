package matrix;
import java.util.concurrent.ExecutionException;
import java.io.IOException;
public class Q5 {
    public static void main(String[] args) {
        System.out.println("Write a Java program to find the determinant of a 2x2 matrix");
        int matrx[][] = {{1,1},{1,2}};
            int r = matrx.length;
            int c = matrx[0].length;
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(matrx[i][j]+"  ");
            }
            System.out.println();
        }
        try {
            if (r!=c){throw new Exception("fuck off");}
        }catch (Exception e){
            System.out.println("EXCEPTION : "+e.getMessage());
        }
        int det = 0;    int a=1,b=1;
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                if (i==j){             a=a*matrx[i][j];}
                if ((i+j) == (r-1)){   b=b*matrx[i][j];}
            }
        }
        det = a-b;

        System.out.println("Determinant of this matrix is : "+ det);
    }
}
