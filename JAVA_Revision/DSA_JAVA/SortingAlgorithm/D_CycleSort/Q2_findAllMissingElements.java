package SortingAlgorithm.D_CycleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q2_findAllMissingElements {
    public static void main(String[] args) {
        System.out.println(" Finding all missing elements in the array ");
//        int[] arr = new int[]{2,3,0,6,7,3,4,1};
        int[] arr = new int[]{0,9,8,6,5,2,1,2,3,1,8,7};
        System.out.println("Array : "+ Arrays.toString(arr));
        missingElements(arr);
        System.out.println("After sorting : "+Arrays.toString(arr));
        System.out.println("Missing Elements are : "+missingElements(arr));
//        System.out.println("MISSING ELEMENTS are : "+missingElements(arr));
    }
    static List<Integer> missingElements(int[] arr){
        List<Integer> missElem = new ArrayList<>();
        int i=0;
        while (i< arr.length){
            int correct = arr[i];
            if (arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else { i++; }
        }
        for (int index=0; index< arr.length; index++){
            if (arr[index] != index){
                missElem.add(index);
                Collections.sort(missElem);
            }
        }
//        System.out.println("Missing elements are : "+missElem);
        return missElem;
    }
}
