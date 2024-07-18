package Searching_Algo.Binary_Search.playlistQ;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;

public class Q11_No_of_Rotations_DuplicateElements {
    public static void main(String[] args) {
        System.out.println("Rotated Sorted Array");
        System.out.println("Finding number of ROTATIONS in the Array");
        int[] arr = new int[]{5,5,5,6,6,6,6,7,8,9,9,1,2,2,3,3,4,4,4,4};
        System.out.println("Array is : "+ Arrays.toString(arr));
        System.out.println(arr[10]);
        System.out.println(rotations(arr));
    }
    static int rotations(int[] arr){
        int r=0;
        int l=0,    u=arr.length-1;
        while (l<=u){
            int mid = l + (u-l)/2;
            if (mid<u && arr[mid] > arr[mid+1]){return mid;}
            else if (mid>l && arr[mid] < arr[mid-1]) {return mid-1;}
            else if (arr[mid] == arr[l] && arr[mid] == arr[u]){
                // check if start is the pivot element
                if(arr[l] > arr[l+1]){  return l; }
                l++;
                // check if start is the pivot element
                if(arr[u] < arr[u-1]){return u-1;}
                u--;
            }
            // left side is sorted So, pivot should be in right hand side
            else if (arr[l]<arr[mid] || (arr[l]==arr[mid] && arr[mid]>arr[u])) {u = mid+1;}
            else {
                l = mid-1;
            }
        }
        return r;
    }
}
