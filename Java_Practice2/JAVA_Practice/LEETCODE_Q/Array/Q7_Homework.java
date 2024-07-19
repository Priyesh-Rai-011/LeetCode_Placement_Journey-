package LEETCODE_Q.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Q7_Homework {
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int queryCount=0;
        for (int i = 0; i<endTime.length; i++) {
            if (startTime[i]<=queryTime && queryTime<=endTime[i]){
                queryCount++;
            }
        }
        return queryCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] startTime = {1,2,3};
        int[] endtTime = {3,2,7};
        System.out.println("Start time array : "+ Arrays.toString(startTime));
        System.out.println("End time array : "+Arrays.toString(endtTime));
        System.out.print("Enter the query time : "); int qTime = sc.nextInt();
        System.out.println(busyStudent(startTime,endtTime,qTime));
    }
}
