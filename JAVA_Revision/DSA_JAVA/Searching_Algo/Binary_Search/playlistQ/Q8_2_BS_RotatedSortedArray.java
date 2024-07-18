package Searching_Algo.Binary_Search.playlistQ;

import java.util.Arrays;
import java.util.Scanner;

public class Q8_2_BS_RotatedSortedArray {
    public static void main(String[] args) throws ArrayNotFoundException, ElementNotFoundException {
        System.out.println("Binary Search in Rotated Sorted Array");
        int[] arr = new int[] {5,6,8,11,20,21,22,23,7,0,1,3,4};
        System.out.println("Array is : "+ Arrays.toString(arr));


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target : ");
        try {
            int target = sc.nextInt();
            System.out.println(target+" is on index : "+bs_rsa(arr,target));
        }
        catch (ElementNotFoundException | ArrayNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    static int bs_rsa(int[] arr, int target) throws ArrayNotFoundException, ElementNotFoundException{
        if (arr == null || arr.length==0){
            throw new ArrayNotFoundException("Array is Empty");
        }
        int l=0,u= arr.length-1;
        while (l<=u){
            int mid = l+(u-l)/2;
            if (arr[mid] == target){ return mid; }
        // left half is sorted
            else if (arr[l] <= arr[mid]) {
                if (target >= arr[l] && target<arr[mid]){
                    u=mid-1;
                }
                else {
                    l=mid+1;
                }
            }
        // right half is sorted
            else {
                if (target <= arr[u] && target > arr[mid]){
                    l=mid+1;
                }
                else {
                    u=mid-1;
                }
            }
        }
//        throw new ElementNotFoundException("Element not present in the array.");
        return u;
    }

    static class ArrayNotFoundException extends Exception {
        public ArrayNotFoundException(String msg){
            super(msg);
        }

    }
    static class ElementNotFoundException extends Exception {
        public ElementNotFoundException(String msg){
            super(msg);
        }
    }
}
