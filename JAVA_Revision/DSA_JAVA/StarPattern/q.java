package StarPattern;

import java.util.Scanner;

public class q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : "); int n = sc.nextInt();
        for (int i=0; i<n; i++){
            int col = n-i;
            for (int j=col; j>0;j--){
                System.out.print("* ");
            }System.out.println();
        }
    }
}
