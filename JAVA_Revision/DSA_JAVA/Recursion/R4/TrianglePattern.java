package Recursion.R4;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
    // Creating a triangle pattern
        Scanner sc = new Scanner(System.in);
        System.out.println("Star Pattern");
        System.out.println("Enter rows : ");
        int row = sc.nextInt();
        inv_triangle(row,0);
        System.out.println("-----------");
        trangle(row,0);
    }
    static void trangle(int row,int col){
        if (row==0){return;}
        else if (col<row) {
            System.out.print("* ");
            trangle(row,col+1);
        }
        else {
            System.out.println();
            trangle(row-1,0);
        }
    }
    static void inv_triangle(int row,int col){
        if (row==0){return;}
        else if (col<row) {
            inv_triangle(row, col+1);
            System.out.print("* ");
        }
        else {
            inv_triangle(row-1,0);
            System.out.println();
        }
    }
}
