package Recursion.R3;

import javax.swing.plaf.synth.SynthLookAndFeel;
import javax.swing.plaf.synth.SynthStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C_2_ReturningArrayList_withoutPassingArgument {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{0,8,7,9,2,3,7,7,64,12,30,9,8,43,4,7};
        System.out.println("Array is : "+ Arrays.toString(arr));

    }
    static ArrayList<Integer> allIndix2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }
        //this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = allIndix2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
     }
}
