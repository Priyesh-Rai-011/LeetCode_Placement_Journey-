package Searching_Algo.Binary_Search.playlistQ;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_floorVal {
    public static void main(String[] args) {
        System.out.println("FIND FLOOR ELEMENT FROM A SORTED ARRAY\n\n");
        int[] arr = new int[]{2,3,5,9,14,14,14,16,18};
        System.out.println("Array is : "+ Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element : ");  int target = sc.nextInt();
        System.out.println("The FLOOR value of target ("+target+") is "+arr[floor(arr,target)]+" || at index ["+floor(arr,target)+"]");
    }
    static int floor(int[] arr,int target){
        int l=0,  u=(arr.length-1);
        if (target < arr[l]){ // if the target is < than the lower bound -
            return -1;        // there will be no element <= to the target
        }
        while (l<=u){
            int mid_index = l+(u-l)/2;
            if (target == arr[mid_index]){
                return mid_index;
            } else if (target < arr[mid_index]){
                u = mid_index-1;
            } else {
                l = mid_index+1;
            }
        }
        return u;
    }
}

