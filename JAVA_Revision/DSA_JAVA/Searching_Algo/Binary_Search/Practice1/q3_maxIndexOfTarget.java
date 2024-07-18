package Searching_Algo.Binary_Search.Practice1;
import java.util.Arrays;
import java.util.Scanner;
//    Last Occurrence of an Element:
// Given a sorted array of integers, find the index of the last occurrence of a given target element.
// If the element is not present, return -1.

public class q3_maxIndexOfTarget {
    public static void main(String[] args) {
        System.out.println("FIND MAX INDEX OF AN ELEMENT IN A SORTED ARRAY\n\n");
        int[] arr = new int[]{1,7,7,7,7,8,11,12,12,14,16,20,21};
        System.out.println("The array is : "+ Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element : ");
        int target = sc.nextInt();

        System.out.println("Element "+target+" found at index : "+maxIndexOfElem(arr,target));
    }
    public static int maxIndexOfElem(int[] arr,int target){
        int l = 0;
        int u = arr.length-1;
        int result_index = -1;
        while (l <= u){
            int mid_index = l + (u-l)/2;
            if (target == arr[mid_index]){
                result_index = mid_index;
                l = mid_index+1;
            }
            else if (target < arr[mid_index]) {
                u = mid_index-1;
            }
            else {
                l = mid_index+1;
            }
        }
        return result_index;
    }
}
