package LEETCODE_Q.Math;

import java.util.ArrayList;

public class Q10 {
    public static int alternateDigitSum(int n) {
        int sum=0, sign=1;
        ArrayList<Integer> digitList = new ArrayList<>();

        // Extract dig
        while (n > 0) {
            digitList.add(n % 10); // Get the last digit
            n /= 10;               // Remove the last digit
        }

        // Reverse the list to maintain the original order
        int[] dig = new int[digitList.size()];
        for (int i = 0; i < digitList.size(); i++) {
            dig[i] = digitList.get(digitList.size() - 1 - i);
            sum += (sign*dig[i]);
            sign *= -1;
        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(alternateDigitSum(521));
        System.out.println(alternateDigitSum(111));
        System.out.println(alternateDigitSum(886996));
        System.out.println(alternateDigitSum(749541300));
    }
}
