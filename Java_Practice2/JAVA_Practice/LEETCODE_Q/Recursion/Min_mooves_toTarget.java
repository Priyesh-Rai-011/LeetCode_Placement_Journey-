package LEETCODE_Q.Recursion;

import java.util.Scanner;

public class Min_mooves_toTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target : "); int target = sc.nextInt();
        System.out.print("Doubles could be used : "); int doubles = sc.nextInt();
        System.out.println("Min moves to reach target is : "+minMoves(target,doubles));
    }
    static int minMoves(int target, int maxDoubles) {
        int moves;
        int no = 1;
        int double_count=0, increment_count=0;
                         System.out.println(no);
                         System.out.println("Double");
        while ((no*2)<=target && double_count<=maxDoubles){
            no=no*2;
            double_count++;
                         System.out.print(no+",");
                         System.out.println(double_count);
        }
                         System.out.println("---------------------------\n"+no);
                         System.out.println("Increment");
        while (no<target){
            no++;
            increment_count++;
                         System.out.print(no+",");
                         System.out.println(increment_count);
        }
                         System.out.println("---------------------------\n"+no);
        moves=double_count+increment_count;
        return moves;
    }
}
