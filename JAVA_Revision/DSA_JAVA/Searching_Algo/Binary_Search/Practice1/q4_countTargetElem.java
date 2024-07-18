package Searching_Algo.Binary_Search.Practice1;
import java.util.Arrays;
import java.util.Scanner;
//    Count of Elements:
// Given a sorted array of integers,count the number of occurrences of a given target element in the array.

public class q4_countTargetElem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("COUNT THE NUMBER OF OCCURANCE OF A TARGET ELEMENT\n\n");
        int[] arr = new int[]{1,7,7,7,7,8,11,12,12,14,16,20,21};
        System.out.println("The Array is : "+ Arrays.toString(arr));

        System.out.print("Enter the target element : "); int target = sc.nextInt();
        System.out.println(target+" : 1st occurred at index [ "+firstOccuranceOfTarget(arr,target)+" ]");
        System.out.println(target+" : last occurrence at index [ "+lastOccuranceOfTarget(arr,target)+" ]");
        System.out.println("There are "+countTarget(arr,target)+" instances of "+target);
    }
// first we will find the 1st & last occurance of the target element
// as it is a sorted array --> there will be same element between the occurrences
// so , we will count the difference between the indices
    static int firstOccuranceOfTarget(int[] arr,int target){
        int l=0,  u=arr.length-1;
        int result_index = -1;
        while (l<=u){
            int mid_index = l + (u-l)/2;
            if (target == arr[mid_index]){
                result_index = mid_index;
                u = mid_index-1;
            }
            else if (target < arr[mid_index]){
                u = mid_index-1;
            }
            else {
                l = mid_index+1;
            }
        }
        return result_index;
    }
    static int lastOccuranceOfTarget(int[] arr,int target){
        int l=0,  u=arr.length-1;
        int result_index = -1;
        while (l<=u){
            int mid_index = l + (u-l)/2;
            if (target == arr[mid_index]){
                result_index = mid_index;
                l = mid_index+1;
            }
            else if (target < arr[mid_index]){
                u = mid_index-1;
            }
            else {
                l = mid_index+1;
            }
        }
        return result_index;
    }

    static int countTarget(int[] arr,int target){
        int fst = firstOccuranceOfTarget(arr,target);
        int lst = lastOccuranceOfTarget(arr,target);
        return (lst-fst)+1;
    }
}
