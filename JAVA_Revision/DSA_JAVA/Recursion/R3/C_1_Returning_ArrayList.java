package Recursion.R3;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// In this code the function (all_Indices) will have ArrayList as the return type
public class C_1_Returning_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{0,8,7,9,2,3,7,7,64,12,30,9,8,43,4,7};
        System.out.println("The array is : "+ Arrays.toString(arr));
        System.out.print("Enter target : "); int target = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = all_Indices(arr,target,0,list);
        System.out.println("All indices : "+ans);
//        System.out.println("All indices : " + all_Indices(arr,target,0,new ArrayList<>()));
    }
    static ArrayList<Integer> all_Indices (int[] arr, int target, int index, ArrayList<Integer> list){
        if (index==arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return all_Indices(arr, target, index+1, list);
    }
}
