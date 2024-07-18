package Recursion.R1_vedio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(" Printing Fibonacci ");
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers in the fibonacci series : "); int num = sc.nextInt();
        System.out.println("The fibonacci series till "+num+" number : ");
        fibonacci_series(num);
    }
    static void fibonacci_series(int n){
        for (int i=0; i<n; i++){
            System.out.print(fibo_number(i)+" ");
        }
    }
    static int fibo_number(int n){
        if(n < 2){
            return n;
        }
        else {
            return fibo_number(n-1) + fibo_number(n-2);
        }
    }
}
