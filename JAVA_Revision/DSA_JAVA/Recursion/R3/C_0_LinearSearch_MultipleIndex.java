package Recursion.R3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//class ElementNotFoundException2 extends Exception{
//    public ElementNotFoundException2(String msg){
//        super(msg);
//    }
//}

public class C_0_LinearSearch_MultipleIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find all indices of target element");
        int[] arr = new int[]{3,7,6,3,2,34,2,1,18,9,7,22,22,9,0,7,8,3,2,34,12,7,0};
        System.out.println("Array is : "+ Arrays.toString(arr));
        System.out.print("Target : ");
//        try {
            int target = sc.nextInt();
            System.out.println("All indices are : ");
            all_Indices(arr,target,0);
        System.out.println(list);
//        } catch (ElementNotFoundException2 e) {
//            System.out.println(e.getMessage());
//        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
//    static int all_Indices(int[] arr, int target, int index) throws ElementNotFoundException2{
    static void all_Indices(int[] arr, int target, int index){
//        if (index>=arr.length){
//            throw new ElementNotFoundException2("Element not found, TRY AGAIN...!!");
//        }
        if (index == arr.length){return;}
        if (arr[index] == target){
            list.add(index);
        }
        all_Indices(arr, target, index+1);
    }
}
