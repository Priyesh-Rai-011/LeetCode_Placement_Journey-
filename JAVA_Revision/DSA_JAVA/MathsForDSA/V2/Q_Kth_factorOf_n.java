package MathsForDSA.V2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// LeetCode Q Link : https://leetcode.com/problems/the-kth-factor-of-n/description/
//  You are given two positive integers n and k. A factor of an integer n is defined as an integer i where n % i == 0.
//  Example 1: Input: n = 12, k = 3
//             Output: 3
//             Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.
//  Example 2: Input: n = 7, k = 2
//             Output: 7
//             Explanation: Factors list is [1, 7], the 2nd factor is 7.
public class Q_Kth_factorOf_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : "); int num = sc.nextInt();
        System.out.print(" kth factor : ");  int k = sc.nextInt();
        System.out.println(kthFactor(num,k));
    }
    static int kthFactor(int num, int k){
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i=1; i<=Math.sqrt(num); i++){
            if (num%i == 0){
                if (num/i == i){factors.add(i);}
                else {
                    factors.add(i);
                    factors.add(num/i);
                }
            }
        }
        Collections.sort(factors);
        System.out.println("Factors are : "+factors);
        if (k>factors.size() || k<0) {  return -1;  }
//        System.out.println(k+"th factor of "+num+" is "+factors.get(k-1));
        return factors.get(k-1);
    }
}
