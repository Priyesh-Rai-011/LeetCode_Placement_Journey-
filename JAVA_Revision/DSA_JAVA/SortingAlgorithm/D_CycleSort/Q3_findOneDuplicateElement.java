package SortingAlgorithm.D_CycleSort;

import java.util.Arrays;

// finding one duplicate element present in the array in the array
public class Q3_findOneDuplicateElement {
    public static void main(String[] args) {
        System.out.println(" Find duplicate element in the array ");
        int[] arr = new int[]{1,6,5,3,0,3,2,4,7};
        System.out.println("Array is : "+ Arrays.toString(arr));
        oneDuplicateElement(arr);
        System.out.println("After sorting : "+Arrays.toString(arr));
        System.out.println("The duplicate element is : "+oneDuplicateElement(arr));
    }
    static int oneDuplicateElement(int[] arr){
        int i=0;
        while (i< arr.length){
            int correct = arr[i];
            if (arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else { i++;  }
        }
        for (int index=0; index< arr.length; index++){
            if (arr[index] != index){
                return arr[index];
            }
        }
        return -1;
    }
}
