package LEETCODE_Q.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q5_partitionArrayAccToGivenPivot {
    public static int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> lessThanPivot = new ArrayList<>();
        ArrayList<Integer> greaterThanPivot = new ArrayList<>();

        for (int num : nums) {//splitting the arrays
            if (num < pivot) {   lessThanPivot.add(num);    }
            else             {   greaterThanPivot.add(num); }
        }
    //placing the pivot element in start of the 2nd list
    // Iterate through the list
        for (int i = 0; i < greaterThanPivot.size(); i++) {
            if (greaterThanPivot.get(i) == pivot) {// Swap the current element with the element at the beginning (shift)
                greaterThanPivot.add(0, greaterThanPivot.remove(i));
            }
        }

        int[] resultArr = new int[lessThanPivot.size()+greaterThanPivot.size()];
//        System.out.println(lessThanPivot);        System.out.println(greaterThanPivot);
        int k=0;
        for (int i=0,j=0; i<lessThanPivot.size() && j<greaterThanPivot.size(); i++,j++,k++){
            resultArr[k] = lessThanPivot.get(i);
            resultArr[lessThanPivot.size()+k] = greaterThanPivot.get(j);
        }
        // Handle remaining elements from any list (if sizes differ)
        if (lessThanPivot.size() > greaterThanPivot.size()) {
            for (int i = greaterThanPivot.size(); i < lessThanPivot.size(); i++,k++) {
                resultArr[k] = lessThanPivot.get(i);
            }
        } else if (greaterThanPivot.size() > lessThanPivot.size()) {
            for (int i = lessThanPivot.size(); i < greaterThanPivot.size(); i++,k++) {
                resultArr[k] = greaterThanPivot.get(i);
            }
        }
        return resultArr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] nums = new int[]{9,12,5,10,14,3,10};
        int[] nums = new int[]{4,0,4,5,-11};
        System.out.println("The Array is : "+ Arrays.toString(nums));
        System.out.print("Enter the pivot :");       int pivot = sc.nextInt();
        System.out.println("After partitioning along the pivot element : ");
        System.out.println(Arrays.toString(pivotArray(nums,pivot)));
    }
}
