package Recursion.R2;

import java.util.Scanner;

// understanding the flow of recursions
// AND    what difference it can make
public class Q1 {
//    public static void main(String[] args) {
//        System.out.println("--  Recursion  --");
//
//        System.out.println("Recursion call after printing the no.");
//        System.out.print("Printing in reverse order : ");   numRev(10);
//        System.out.println("\n------------------------");
//        System.out.println("Recursion call before printing the no.");
//        System.out.print("Printing in sequential order : ");    num(5);
//    }
//    static void numRev(int n){
//        if (n==0){return;}
//        System.out.print(n+",");
//        numRev(n-1);
//    }
//    static void num(int n){
//        if (n==0){return;}
//        num(n-1);
//        System.out.print(n+",");
//    }
public static void main(String[] args) {
    System.out.println("factorial Question");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no, whose factorial you want to calculate : ");  int num = sc.nextInt();
    System.out.println(fact(num));
}
//static int fact(int n){ // ITERATIVE APPROACH
//    int fact=1;
//    if(n == 0){fact = 1;}
//    else if (n == 1) {fact = 1;}
//    else {
//        for (int i=1; i<=n; i++){
//            fact = fact*i;
//        }
//    }
//    return fact;
//}
    static int fact(int n) {
    if (n==0 || n==1){return 1;}
    return n*fact(n-1);
    }
}
