package Searching_Algo.Binary_Search.playlistQ;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_ceilingVal {
    public static void main(String[] args) {
        System.out.println("SEALING OF A NUMBER");
        int[] arr = new int[]{2,3,5,9,14,16,18};
        System.out.println("Array is : "+ Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element : "); int target = sc.nextInt();
        System.out.println("The CEILING value of the target ("+target+") is : "+ceiling(arr,target));
    }
    static int ceiling(int[] arr,int target){
        int l=0,  u=(arr.length-1);
//        int result = -1;
        if (target > arr[u]){ // if the target is > the upper bound -
            return -1;        // there will be no element >= to the target
        }
        while (l<=u){
            int mid_index = l + (u-l)/2;
            if (target == arr[mid_index]){
            // target element is present in the array
                return arr[mid_index]; //  ceiling element == target element
            } else if (target < arr[mid_index]) {
                u = mid_index-1;
            } else {
                l = mid_index+1;
            }
        }
//  At this point -->
//    lower bound > upper bound    ----- while loop breaks
//    target element is not present in the array
//    so the lower bound element would be the ceiling element...!!!
        return arr[l];
    }
}
