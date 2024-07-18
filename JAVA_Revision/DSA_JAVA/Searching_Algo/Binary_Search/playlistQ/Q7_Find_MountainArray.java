package Searching_Algo.Binary_Search.playlistQ;

import java.util.Arrays;
import java.util.Scanner;

public class Q7_Find_MountainArray {
    public static void main(String[] args) {
        System.out.println("----  FINDING AN ELEMENT IN A MOUNTAIN ARRAY  ----");

        int[] arr = new int[] {1,2,4,5,7,8,9,10,20,19,17,15,14,13,11};
        System.out.println("Array is : "+ Arrays.toString(arr));
        System.out.println("Peak element : "+arr[peakElem(arr)]+" || At index "+peakElem(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Search element : ");    int target = sc.nextInt();
        System.out.println("The element is at index : "+search(arr,target));
    }

    static int search(int[] arr,int target){
        int peak = peakElem(arr);
        int result_index = bs(arr, target,0,peak);

        if (result_index != -1) {  return result_index;  }
        result_index = bs(arr,target,peak+1, arr.length-1);
        return result_index;
    }
    static int peakElem(int[] arr){
        int l=0,    u=arr.length-1;
        while (l<u){
            int mid_index = l + (u-l)/2;
            if (arr[mid_index] > arr[mid_index+1] && arr[mid_index] > arr[mid_index-1]){
                return mid_index;
            } else if (arr[mid_index] < arr[mid_index+1]) {
                l = mid_index+1;
            } else {
                u = mid_index-1;
            }
        }
        return l;
    }

    static int bs(int[] arr,int target, int start, int end) {
        int l=start,    u=end;
        if (arr[l] < arr[u]){// if array is in ascending order
//            System.out.println("Element in 1st half of the array");
//            System.out.println("UpperBound = "+u+" || LowerBound = "+l);
            while (l<=u){
                int mid_index = l + (u-l)/2;
                if (target == arr[mid_index]){
                    return mid_index;
                } else if (target < arr[mid_index]) {
                    u = mid_index-1;
                } else {
                    l = mid_index+1;
                }
            }
        }
        else if (arr[u] < arr[l]){// if the array is in descending order
//            System.out.println("Element in 2nd half of the array");
//            System.out.println("UpperBound = "+u+" || LowerBound = "+l);
            while (l<=u){
                int mid_index = l + (u-l)/2;
                if (target == arr[mid_index]){
                    return mid_index;
                } else if (target > arr[mid_index]) {
                    u = mid_index-1;
                } else {
                    l = mid_index-1;
                }
            }
        }
        return -1;//if the element is not found
    }
}
