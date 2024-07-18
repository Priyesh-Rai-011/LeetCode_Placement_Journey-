package Searching_Algo.Binary_Search.Practice1;

import java.util.Arrays;
import java.util.Scanner;

public class q5_closestToTarget {
    public static void main(String[] args) {
        System.out.println("FIND THE NUMBER CLOSEST TO THE TARGET NUMBER\n\n");
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[]{1,7,7,7,7,8,11,12,12,14,16,20,21};
        System.out.println("The Array is : "+ Arrays.toString(arr));

        System.out.print("Enter the target element : "); int target = sc.nextInt();
        System.out.println("Closest element to the target is : "+closest(arr,target));
    }
    static int closest(int[] arr, int target){
        int l=0,  u=arr.length-1;
        while (u<=l){
            int mid_index = l + (u-l)/2;
            if (target == arr[mid_index]){
                return mid_index;
            }
            else if (target<arr[mid_index]) {
                u=mid_index-1;
            }
            else {
                l=mid_index+1;
            }
        }
    // At this point, left and right pointers have crossed
    // Determining the closest element among arr[right] and arr[left]
        if (u < 0){
            return arr[l];//all elements are greater than the target element
        } else if (l >= arr.length) {
            return arr[u];//all elements are smaller than the target element
        }else {
            int l_diff = target-arr[l];
            int u_diff = arr[u]-target;
            return l_diff<=u_diff ? arr[l] : arr[u];
        }
    }
}
