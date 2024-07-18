package Leetcode_GOOD_QUESTIONS;
//LeetCoded Q : 2139
//Link : https://leetcode.com/problems/minimum-moves-to-reach-target-score/description/

//You are playing a game with integers. You start with the integer 1 and you want to reach the integer target.
//
//In one move, you can either:
//
//Increment the current integer by one (i.e., x = x + 1).
//Double the current integer (i.e., x = 2 * x).
//You can use the increment operation any number of times, however, you can only use the double operation at most maxDoubles times.
//Given the two integers target and maxDoubles, return the minimum number of moves needed to reach target starting with 1.
//      Example 1:
//Input: target = 5, maxDoubles = 0
//Output: 4
//Explanation: Keep incrementing by 1 until you reach target.
//     Example 2:
//Input: target = 19, maxDoubles = 2
//Output: 7
//Explanation: Initially, x = 1
//Increment 3 times so x = 4
//Double once so x = 8
//Increment once so x = 9
//Double again so x = 18
//Increment once so x = 19
import java.util.Scanner;

public class Q3_MinMoves_to_ReachTarget {
    static int minMoves(int target, int maxDoubles) {
        if (target == 1)     {  return 0;  }//target is to reach 1
        if (maxDoubles == 0) {  return target - 1;  }//only increments are possible

        if (target % 2 == 0 && maxDoubles > 0) {//preferring to double the value
            return 1 + minMoves(target >> 1, maxDoubles - 1);
        }
        return 1 + minMoves(target - 1, maxDoubles);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target value : ");  int target = sc.nextInt();
        System.out.print("Enter the max no. of doubles allowed : "); int doub = sc.nextInt();
        System.out.println("---------------------------------");
        System.out.println("Min no. of moves to reach the target value is : "+minMoves(target,doub));
    }
}

