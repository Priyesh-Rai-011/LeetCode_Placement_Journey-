package Recursion.R1_vedio;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        System.out.println(" Binary Search Using Recursive Approach ");
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array is : "+ Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target element : "); int target = sc.nextInt();

        int index = bs(arr,0,arr.length-1,target);
    //---- learned a new thing -------------------------------------------
        System.out.println(index>=0 ? "Element is found at index : "+index : "Element is not present in the array....!!" );
    //--------------------------------------------------------------------
    }
    static int bs(int[] arr, int lb, int ub, int target) {
        if (lb <= ub){
            int mid = lb + (ub-lb)/2;
            if (arr[mid] == target){return mid;}
            else if (target < arr[mid]) {
                return bs(arr,lb,mid-1,target);
            }
            else {
                return bs(arr,mid+1,ub,target);
            }
        }
        return -1;//element not found
    }
}
