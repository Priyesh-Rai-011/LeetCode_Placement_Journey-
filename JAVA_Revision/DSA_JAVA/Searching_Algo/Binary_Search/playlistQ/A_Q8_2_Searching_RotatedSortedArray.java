package Searching_Algo.Binary_Search.playlistQ;
// Finding an element in a Rotated Sorted Array
import java.util.Arrays;
import java.util.Scanner;

public class A_Q8_2_Searching_RotatedSortedArray {
    public static void main(String[] args) {
        System.out.println("----  SEARCHING AN ELEMENT IN (ROTATED SORTED ARRAY)   ----");
        int[] arr = new int[] {5,7,8,11,20,21,22,27,0,1,3,4};
                            // 27,0,1,3,4,5,7,8,11,20,21,22
        System.out.println("Array is : "+ Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element : ");    int target = sc.nextInt();
        if (bs(arr,target) != -1){
            System.out.println("Target element  is at index : "+bs(arr,target));
        }
        else {
            System.out.println("ERROR : Element not found");
        }
    }

    public static int bs(int[] arr, int target){
        int l=0,  u=arr.length-1;
        while (l<=u){
            int mid = l+(u-l)/2;
        //  if the element found at middle is same as target
            if (arr[mid] == target){return mid;}
        //  checking for the TARGET in the left half
        //        {5,7,8,11,20,21,22,27,0,1,3,4}
        //                     ^
            else if (arr[l] <= arr[mid]) {// if mid elem >  than lower bound
                                          // target in right half of the array
                                          // left half is sorted
                if (arr[l] <= target && target < arr[mid]){
                    u = mid-1;
                }
                else {
                    l = mid+1;
                }
            }
        //  checking for the TARGET in the right half
        //        {5,7,8,11,20,21,22,27,0,1,3,4}
        //                     ^
            else {                       //  if mid elem < than UPPER bound
                                         //  target in left half of the array
                                         //  right half is sorted
                if (arr[mid] < target && target <= arr[u]){
                    l = mid+1;
                }
                else {
                    u = mid-1;
                }
            }
        }
        return -1; // target not present in the array
    }
}
