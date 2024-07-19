package LEETCODE_Q.Searching;

import java.util.Arrays;

public class Q2_Not_MinMax {
    public static void main(String[] args) {
        int[] arr = new int[]{2,1,3};
        System.out.println("Array is : "+ Arrays.toString(arr));
        System.out.println("After merge sort : "+ Arrays.toString(mergeSort(arr)));
        System.out.println(findNonMinOrMax(arr));
    }
    public static int findNonMinOrMax(int[] nums) {
        int[] sortedNums = mergeSort(nums);
        int min=sortedNums[0]; int max=sortedNums[sortedNums.length-1];
        for (int i=0; i< sortedNums.length-1 ;i++){
            if (sortedNums[i]!=min && sortedNums[i]!=max){
                return sortedNums[i];
            }
        }
        return -1;
    }
    static int[] mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] left = new int[mid];
            int[] right = new int[arr.length - mid];

            System.arraycopy(arr, 0, left, 0, mid);
            if (arr.length - mid >= 0) System.arraycopy(arr, mid, right, 0, arr.length - mid);

            left = mergeSort(left);
            right = mergeSort(right);

            return merge(left, right);
        }
        return arr; // Return the array if it has only one element
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}
