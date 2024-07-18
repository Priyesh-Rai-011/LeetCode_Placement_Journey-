package Searching_Algo.Binary_Search.playlistQ;
// Q Link ; https://leetcode.com/problems/peak-index-in-a-mountain-array/
// An array arr is a mountain if the following properties hold:
//
//arr.length >= 3
//There exists some i with 0 < i < arr.length - 1 such that:
//arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
//Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
//
//You must solve it in O(log(arr.length)) time complexity.
//
//
//
//Example 1:
//
//Input: arr = [0,1,0]
//Output: 1
import java.util.Arrays;

public class Q6_MountainArray {
//========================  LeetCode Solution   ========================================
    /*class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0, u = arr.length - 1;
        while (l <= u) {
            int mid_index = l + (u - l) / 2;
            if (mid_index > 0 && mid_index < arr.length - 1) {
                if (arr[mid_index] > arr[mid_index - 1] && arr[mid_index] > arr[mid_index + 1]) {
                    return mid_index;
                } else if (arr[mid_index] < arr[mid_index + 1]) {
                    l = mid_index + 1;
                } else {
                    u = mid_index - 1;
                }
            } else {
                // If mid_index is at the boundary of the array, we can't compare with adjacent elements.
                // However, the problem assumes a valid mountain array, so this case should not occur.
                // You might want to add an error message or handling for such situations.
                return 1; // Indicating an error
            }
        }
        return -1; // Indicating an error (no peak found)
    }
}
*/

    public static void main(String[] args) {
        System.out.println("----  FINDING PEAK ELEMENT IN AN ARRAY  ----");
        int[] arr = new int[] {1,3,4,6,7,8,9,10,11,10,8,7,5,2};
        System.out.println("The array is : "+ Arrays.toString(arr));
//        System.out.println("The peak element is : "+arr[ls_peakElem(arr)]);
        System.out.println("The peak element is : "+arr[bs_PeakElem(arr)]);
        System.out.println("At index : "+bs_PeakElem(arr));
    }

    static int bs_PeakElem(int[] arr){
        int l=0,    u= arr.length-1;
        while (l <= u){
            int mid_index = l+(u-l)/2;
            System.out.print(l+"|");
            System.out.print(mid_index+"|");
            System.out.println(u);
            System.out.println("----------");
        //    if mid element is the peak
            if (arr[mid_index] > arr[mid_index-1] && arr[mid_index] > arr[mid_index+1]){
                return mid_index;
            }
        //   If middle element is smaller than the next element,
        //   peak element lies on the right half of the array
            else if (arr[mid_index] < arr[mid_index+1]) {
                l = mid_index+1;
            }
        //    If middle element is smaller than the previous element,
        //    peak element lies on the left half of the array
            else {
                u = mid_index-1;
            }
        }
        return l;
    }





//    static int ls_peakElem(int[] arr){
//        int peak = 0;
//        for (int i=1; i<arr.length-1; i++){
//            System.out.println(i);
//            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]){
//                peak = i;
//            }
//        }
//        System.out.println("--------");
//        return peak;
//    }
}
