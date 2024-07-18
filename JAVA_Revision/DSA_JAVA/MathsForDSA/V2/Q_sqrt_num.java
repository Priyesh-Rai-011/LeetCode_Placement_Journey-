package MathsForDSA.V2;

import java.util.Scanner;

// LeetCode Question : https://leetcode.com/problems/sqrtx/
//   Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
//   The returned integer should be non-negative as well.
// Example 1: Input: x = 4
//            Output: 2
//            Explanation: The square root of 4 is 2, so we return 2.
// Example 2:  Input: x = 8
//             Output: 2
//             Explanation: The square root of 8 is 2.82, and since we round it down to the nearest integer, 2 is returned.
public class Q_sqrt_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");  int num = sc.nextInt();
        System.out.println("Square root of the number : "+mySqrt(num));
    }

    public static double mySqrt(int num) {
        int l=0, r=num;
        while (l < r) {
            int mid = l+(r-l)/2;
            if (mid <= num / mid) {
                // mid*mid <= num
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }
}
