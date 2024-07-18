package MathsForDSA.V1;

import java.util.Scanner;

// Q). To check if the number(n) is of the form 2^x
//           n = 2^x
public class Q8_IfNumberOfForm_2n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");    int num = sc.nextInt();
        check(num);
    }
    static void check(int n){
        int result = n & (n-1);
        int count=0; int n_copy=n;

        if (result == 0){
            System.out.println(n+" is = 2^x ...!");
            while (n_copy>0 && n_copy%2==0){
                n_copy = n_copy/2;
                count++;
            }
            System.out.println(n+" is 2^"+(count));
        }
        else {
            System.out.println(n+" is != 2^x");
        }

    }
}
