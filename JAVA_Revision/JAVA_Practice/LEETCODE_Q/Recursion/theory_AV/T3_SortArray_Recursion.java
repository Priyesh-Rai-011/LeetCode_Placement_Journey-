package LEETCODE_Q.Recursion.theory_AV;

import java.util.Arrays;

public class T3_SortArray_Recursion {
    static void sort(int[]arr ,int l_idx){
        // Base case: if l_idx is 0, the array is sorted
        if (l_idx <= 0) {  return;  }

        sort(arr, l_idx - 1);  // Sort the first l_idx - 1 elements

//         -<>-  ACTUAL OPERATION OF SORT FUNCTION  -<>-
        // Insert the last element at its correct position
        int elem = arr[l_idx - 1]; // Use l_idx - 1 to access the correct element
        int i = l_idx - 2;
        // Shift elements to find the correct position for elem
        for (int j = i; (j >= 0 && arr[j] > elem); j--) {
            arr[j + 1] = arr[j];
        }
        // Place elem at its correct position
        arr[i + 1] = elem;

        // Optional: Print the array after each insertion for debugging
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        sort(new int[]{2,4,3,6,7,5,9,8},8);
    }
}
