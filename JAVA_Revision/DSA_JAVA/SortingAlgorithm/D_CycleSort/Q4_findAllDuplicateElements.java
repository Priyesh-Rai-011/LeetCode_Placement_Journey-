package SortingAlgorithm.D_CycleSort;

import java.util.*;

// finding all duplicate elements in the array
public class Q4_findAllDuplicateElements {
    public static void main(String[] args) {
        System.out.println(" Finding all Duplicate elements in the array ");
        int[] arr = new int[]{1,3,2,8,1,7,8,9,11,6,3,2};
        System.out.println("Array is : "+ Arrays.toString(arr));
        allDuplicates(arr);
        System.out.println("After sorting : "+Arrays.toString(arr));
        System.out.println("Duplicate elements are : "+allDuplicates(arr));
    }
    static List<Integer> allDuplicates(int[] arr){
        List<Integer> duplicates = new ArrayList<>(5);

        int i=0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else { i++; }
        }
        for (int index=0; index< arr.length; index++){
            if (arr[index] != index+1){
                duplicates.add(arr[index]);
                Collections.sort(duplicates);
//                duplicates.sort(null); //    will do the same work
            }
        }
        return duplicates;
    }
}
