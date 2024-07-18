package Recursion.R2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Reversing a number using diff. methods");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");    int num = sc.nextInt();
        int rev_num = rev(num);
        System.out.println("The number in reverse is : "+rev_num);
    }
//--------    method 1   -----------------
    static int sum = 0;
    static int rev(int n){
        if (n==0){return 0;}
        int rem = n%10;
        sum = sum*10 + rem;
        rev(n/10);
        return sum;
    }
//----------------------------------------
//--------    method 2   -----------------
    static int rev2(int n){
        if (n==0){return 0;}
        int reversed=0;

        return reversed;
    }
}
