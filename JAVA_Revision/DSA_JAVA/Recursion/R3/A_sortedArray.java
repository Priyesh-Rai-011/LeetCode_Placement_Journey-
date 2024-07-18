package Recursion.R3;

import java.util.Arrays;
//import java.util.Scanner;
class IsSorted{
    public static boolean isSorted(int[] arr,int index){
//        while (index<arr.length-2 && index>=0){
//            return ( (arr[index]<arr[index+1]) && (isSorted(arr, index+1)) );
//        }
//        return arr[arr.length-2]<arr[arr.length-1];
        if(index == arr.length-1){return true;}
        return ( (arr[index]<arr[index+1]) && (isSorted(arr, index+1)) );
    }
}

public class A_sortedArray {

    public static void main(String[] args) {
        System.out.println("Checking if arra is sorted or not using recursion");
//        Scanner sc =  new Scanner(System.in);
        int[] arr = new int[]{1,2,4,3,7,8,9,11,14};
//        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        System.out.println("The array is : "+ Arrays.toString(arr));
//        IsSorted check = new IsSorted();

        System.out.println(IsSorted.isSorted(arr,0));
    }
}
