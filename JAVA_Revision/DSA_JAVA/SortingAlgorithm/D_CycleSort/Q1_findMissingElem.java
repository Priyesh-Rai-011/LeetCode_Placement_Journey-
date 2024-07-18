package SortingAlgorithm.D_CycleSort;

import java.util.Arrays;

//Q). Finding missing element from an array sorted from (1-N) using --> Cycle Sort
public class Q1_findMissingElem {
    public static void main(String[] args) {
        System.out.println(" Q1 Finding missing ");
//        int[] arr = new int[]{3,1,0,2,5};
        int[] arr = new int[]{3,1,5,4,0,2,6};
        System.out.println("Array is : "+ Arrays.toString(arr));
//        if(missingNumber_CS(arr) == arr.length){
//            System.out.println("No missing element is found ...!");
//        }
//        else {
            System.out.println("The missing element is : "+missingNumber_CS(arr));
//        }
        System.out.println("After array is : "+Arrays.toString(arr));
    }

    static int missingNumber_CS(int[] arr) {
        int i=0;
        while (i< arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else { i++; }
        }
        // searching for the first missing number
        for (int index=0; index < arr.length; index++){
            if (arr[index] != index){
                return index;
            }
        }
//        case 2
        return arr.length;
    }
}
