package Recursion.Practice_Question;

import java.util.Scanner;

// LeetCode Q50 Link : https://leetcode.com/problems/powx-n/
//  Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
//  case 1 : 2^10
//  case 2 : 3^11
//  case 3 : 3^(-11)  --> negative power
public class Q1_Pow_x_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");  double x = sc.nextDouble();
        System.out.print("Enter power : ");   int n = sc.nextInt();

        System.out.println("Result of "+x+"^"+n+" = " + pow(x,n));
    }
    static double pow(double x,int n){
    // If n=0 ----> any number^0 = 1
        if (n==0)  { return 1.0; }
    // If n < 0
        else if (n<0) { x = 1/x;
            // Handle potential overflow for Integer.MIN_VALUE
                        if (n == Integer.MIN_VALUE) {
                            x *= x;
                            n = n / 2;
                        }
                        n = -n;
        }
    // else normal case
    // implementing Fast Exponentiation Algorithm to calculate the result
        double halfPow = pow(x,n/2);
           if (n%2 == 0){ return halfPow*halfPow; }
           else         { return x*halfPow*halfPow; }

    }
}
