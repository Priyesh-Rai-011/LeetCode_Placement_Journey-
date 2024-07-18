package Leetcode_GOOD_QUESTIONS;

import java.util.Arrays;
import java.util.Scanner;

public class Q4_Kth_LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{0, 9, 2, 1, 3, 7, 8, 5, 18, 79, 87, 24, 31};
        System.out.println("Array is : ");
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("The " + n + "-th largest element in the Array is : " + findKthLargest(arr, n));
    }

    static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        return quickSelect(nums, 0, n - 1, n - k);
    }

    static int quickSelect(int[] nums, int left, int right, int k) {
        if (left == right) {
            return nums[left];
        }

        int pivotIndex = partition(nums, left, right);

        if (pivotIndex == k) {
            return nums[k];
        } else if (pivotIndex < k) {
            return quickSelect(nums, pivotIndex + 1, right, k);
        } else {
            return quickSelect(nums, left, pivotIndex - 1, k);
        }
    }

    static int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left;

        for (int j = left; j < right; j++) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
        }

        swap(nums, i, right);
        return i;
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
