package LEETCODE_Q.Recursion;
// LeetCode Question : 2169. Count Operations to Obtain Zero
//Link: https://leetcode.com/problems/count-operations-to-obtain-zero/description/

//You are given two non-negative integers num1 and num2.
//In one operation, if num1 >= num2, you must subtract num2 from num1, otherwise subtract num1 from num2.
//For example, if num1 = 5 and num2 = 4,
// subtract num2 from num1, thus obtaining num1 = 1 and num2 = 4.
// However, if num1 = 4 and num2 = 5,
// after one operation, num1 = 4 and num2 = 1.

import java.util.Scanner;

public class no_of_operation {
    public int countOperations(int num1, int num2) {
        return helper(num1, num2, 0);
    }

    private int helper(int n1, int n2, int operations) {
        if (n1 == 0 || n2 == 0) {
            return operations;
        } else if (n1 >= n2) {
            n1 = (n1 - n2);
            return helper(n1, n2, operations + 1);
        }
        else {
            n2 = (n2 - n1);
            return helper(n2, n1, operations + 1);
        }
        //------------------------------------------
//        int count=0;
//        while (n1!=0 && n2!=0){
//
//        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 :"); int num1 = sc.nextInt();
        System.out.print("Enter num2 :"); int num2 = sc.nextInt();
        no_of_operation NOP = new no_of_operation();

        System.out.println("No. of operation count to get zero is : "+NOP.countOperations(num1,num2));
    }
}