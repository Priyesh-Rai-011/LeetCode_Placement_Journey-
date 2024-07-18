package StarPattern;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Star Pattern");
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();

        for(int i=1; i <= (2*n)-1; i++){
            if (i<=n){
                for (int j=1; j<=i; j++){
                    System.out.print("* ");
                }System.out.println();
            }
            else {
                int col = (2*n)-i;
                for (int j=col; j>0; j--){
                    System.out.print("* ");
                }System.out.println();
            }
        }
    }
}

