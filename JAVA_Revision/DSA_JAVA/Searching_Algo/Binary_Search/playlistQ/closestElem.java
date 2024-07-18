package Searching_Algo.Binary_Search.playlistQ;

import java.util.Arrays;
import java.util.Scanner;

public class closestElem {
    static int closest(int[]arr,int target){
        int ceiling = arr[ceiling(arr, target)];
        int floor = arr[floor(arr, target)];
    // calculating difference between target elem and (floor/ceiling) element ...!!
    // if floor_diff <= ceiling_diff      ---->   return floor element
    // else if ceiling diff < floor diff  ----->  return ceiling element
        return Math.abs(target-floor) <= Math.abs(target-ceiling) ? floor : ceiling;
    }


    public static void main(String[] args) {
        System.out.println("FINDING THE CLOSEST ELEMENT IN THE ARRAY");
        int[] arr = new int[]{2,3,5,9,12,14,16,18,21};
        System.out.println("Array is : "+ Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element : ");  int target = sc.nextInt();
        System.out.println("Ceiling value of "+target+" : "+arr[ceiling(arr,target)]);
        System.out.println("Floor value of "+target+" : "+arr[floor(arr,target)]);
    // ---------------------------------------------------------------------------
        System.out.println("The closest element to the target element ("+target+") is : "+closest(arr,target));
    }


    static int ceiling (int[] arr,int target){
        int l=0,  u= arr.length-1;
        while (l<=u){
            int mid_index = l+(u-l)/2;
            if (target == arr[mid_index]) {return mid_index;}// target element in the array
            else if (target < arr[mid_index]) {u = mid_index-1;}
            else {l = mid_index+1;}
        }
        //target elem not present in the array
        return l;//returning lower bound
    }
    static int floor (int[] arr,int target){
        int l=0,  u=arr.length-1;
        while (l<=u){
            int mid_index = l+(u-l)/2;
            if (target == arr[mid_index]) {return mid_index;}//target elem already present in the array
            else if (target < arr[mid_index]) {u = mid_index-1;}
            else {l = mid_index+1;}
        }
        //target elem not present in teh array
        return u;//returning the upper bound
    }
}
