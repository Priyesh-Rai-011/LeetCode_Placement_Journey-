package Strings;

import java.util.Scanner;

/*
Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.
Example 1:
Input: date = "2019-01-09"      Output: 9
Explanation: Given date is the 9th day of the year in 2019.
Example 2:
Input: date = "2019-02-10"      Output: 41
 */
// Q Link : https://leetcode.com/problems/day-of-the-year/description/
public class DaysOfTheYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Date format : YYYY-MM-DD : "); String date = sc.nextLine();
        dayOfYear(date);
        System.out.println("It is the "+dayOfYear(date)+"th day of the year...!");
    }
    public static int dayOfYear(String date) {
        int y = Integer.parseInt(date.substring(0,4));
        int m = Integer.parseInt(date.substring(5,7));
        int d = Integer.parseInt(date.substring(8));
        int leap = y%400==0 || (y%4==0 && y%100 != 0) ? 29:28;
        int[] month = new int[]{31, leap, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int ans = d;
        for (int i=0; i<(m-1); i++){
            ans = ans + month[i];
        }
        return ans;
    }
}
