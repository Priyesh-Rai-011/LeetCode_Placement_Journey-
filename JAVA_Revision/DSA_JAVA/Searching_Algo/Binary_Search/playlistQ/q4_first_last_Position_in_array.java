package Searching_Algo.Binary_Search.playlistQ;

import java.util.Arrays;
import java.util.Scanner;

public class q4_first_last_Position_in_array {
    public static void main(String[] args) {
        System.out.println("FIND FIRST & LAST POSITION OF TARGET ELEMENT IN ARRAY");

        int[] arr = new int[] {1,2,3,4,4,6,5,7,6,8,7,7,5,4,2,6,4,7,8,7,9,8,7,9,8,7,10};
        Arrays.sort(arr);
        System.out.println("Array is : \n"+Arrays.toString(arr));

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the target element : ");    int target=sc.nextInt();
        System.out.println("FIRST occurance at index : "+ first_Instance(arr,target));
        System.out.println("LAST  occurance at index : "+ last_Instance(arr,target));
        System.out.println("There are total "+count_instances(arr,target)+" instances of "+target);
    }
    static int count_instances(int[] arr, int target){
        int fst = first_Instance(arr, target);
        int lst = last_Instance(arr, target);
        return ((lst-fst)+1);
    }
    static int first_Instance(int[] arr, int target){
        int l=0,    u= arr.length-1;
        while (l<=u){
            int mid_index = l+(u-l)/2;
            if (target == arr[mid_index]){
                u = mid_index-1; // to check weather
                                 // the target element is present on the LEFT SIDE of the array or not
            } else if (target < arr[mid_index]) {
                u = mid_index-1;
            } else {
                l = mid_index+1;
            }
        }
        return l;
    }
    static int last_Instance(int[] arr, int target){
        int l=0,    u=arr.length-1;
        while (l<=u){
            int mid_index = l+ (u-l)/2;
            if (target == arr[mid_index]){
                l = mid_index+1;
            }else if(target < arr[mid_index]){
                u = mid_index-1;
            }else {
                l = mid_index+1;
            }
        }
        return u;
    }
}
