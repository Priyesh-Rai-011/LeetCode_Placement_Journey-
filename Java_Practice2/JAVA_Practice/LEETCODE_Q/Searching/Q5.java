package LEETCODE_Q.Searching;

import java.util.Arrays;

public class Q5 {
    public static boolean checkIfExist(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        // Loop iterates until low <= high (search space exists)
        for (int i = 0; low <= high; i++) {
            int target = arr[i]*2;

            int mid = (low + high) / 2;
            if (arr[mid] == target) {  return true; }
            else if (arr[mid] < target) {  low  = mid + 1;  }
            else                        {  high = mid - 1; }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10,2,5,3};
        System.out.println("The array is : "+ Arrays.toString(arr));
        System.out.println(checkIfExist(arr));
    }
}
