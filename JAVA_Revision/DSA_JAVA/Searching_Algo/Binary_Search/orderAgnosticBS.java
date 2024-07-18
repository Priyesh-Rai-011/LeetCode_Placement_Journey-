package Searching_Algo.Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class orderAgnosticBS {
    public static void main(String[] args) {
        System.out.println("ORDER AGNOSTIC BINARY SEARCH\n\n");
        Scanner sc = new Scanner(System.in);
        int target;

        int[] arr = new int[]{1,23,43,56,2,3,4,5,7,10,34,54,56,67,89,100};
        Arrays.sort(arr);   // sorting the array in ascending order
        System.out.println(Arrays.toString(arr));
//  ---------------------------  BINARY SEARCH  -----------------------------
        System.out.print("Enter the to find : ");     target = sc.nextInt();
        System.out.println("Element found at index : "+orderAgno_BS(arr,target));

        System.out.println("*************************************************************");

        int[] arr_r = new int[arr.length];// creating the same array in descending order
        for (int i=0; i<= arr.length-1; i++) { arr_r[i] = arr[arr.length-1-i]; }
        System.out.println(Arrays.toString(arr_r));
//  ---------------------------  BINARY SEARCH  -----------------------------
        System.out.print("Enter the to find : ");     target = sc.nextInt();
        System.out.println("Element found at index : "+orderAgno_BS(arr_r,target));
    }
//--------------------------------------------------------------------
//    -----------------  METHODS DESCRIBED HERE  -----------------
//--------------------------------------------------------------------
    static int orderAgno_BS(int[] arr,int target){
        int l = 0, u = arr.length-1;
        if (arr[l] < arr[u]){//finding if array is sorted in ascending or descending order - ascending
            System.out.println("Array is sorted in Ascending order ---- ");
            while (l<=u){
                int mid_i = l+(u-l)/2;//finding middle element
                if (arr[mid_i] == target){
                    return mid_i;//found the element and returning its index
                } else if (target < arr[mid_i]) {
                    u = mid_i-1;
                }
                else {
                    l = mid_i+1;
                }
            }
        }
        else if (arr[l] > arr[u]){//condition for descending order
            System.out.println("Array is sorted in Descending order ----- ");
            while (l<=u){
                int mid_i = l+(u-l)/2;//finding middle element
                if (arr[mid_i] == target){
                    return mid_i;//found the element and returning its index
                }
                else if (target < arr[mid_i]) {
                    l = l+1;
                }
                else {
                    u = u-1;
                }
            }
        }
        return -1;//for the case -- Element is not present in the Array
    }
}
