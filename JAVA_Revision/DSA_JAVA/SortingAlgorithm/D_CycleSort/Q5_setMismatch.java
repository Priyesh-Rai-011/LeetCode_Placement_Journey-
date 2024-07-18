package SortingAlgorithm.D_CycleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//                  --------  Set Mismatch  --------
// we have an integer array, one element gets duplicated to another number
// results in repetition of one number || loss of another number
public class Q5_setMismatch {
    public static void main(String[] args) {
        int [] arr = new int[]{2,1,3,8,9,0,5,6,5,8};
        System.out.println("Array is : "+ Arrays.toString(arr));
        setMismatch(arr);
        System.out.println("After sort : "+Arrays.toString(arr));
        System.out.println("MISS MATCH ELEMENTS");
        System.out.println("[repeat number,lost number] : "+Arrays.deepToString(setMismatch(arr)));
    }
    static int[][] setMismatch(int[] arr){
        List<int[]> set = new ArrayList<>();
        int i=0;
        while (i< arr.length){
            int correct = arr[i];
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else { i++; }
        }
        for (int index=0; index<arr.length; index++){
            if (arr[index] != index){
                set.add(new int[]{arr[index],index});
            }
        }
        return set.toArray(new int[0][]);
    }
}
