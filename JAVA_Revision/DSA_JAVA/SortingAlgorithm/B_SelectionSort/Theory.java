package SortingAlgorithm.B_SelectionSort;

import java.util.Arrays;

public class Theory {
    static void SelectionSort(int[] arr) {
        // One by one move boundary of unsorted sub array
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    //---------------------------------------------------------------
//    static void selectionSort(int[] arr){
//        for (int i=0; i< arr.length; i++){
//          //  find the max item in the remaining array and swap with correct index
//            int last = arr.length-1-i;
//            int maxIndex = getMaxIndex(arr,0,last);
//
//            swap(arr,maxIndex,last);
//        }
//    }
//
//    static int getMaxIndex(int[] arr, int start, int end) {
//        int max = start;
//        for (int i=start; i<=end; i++){
//            if (arr[max] < arr[i]){
//                max = i;
//            }
//        }
//        return max;
//    }
//    static void swap(int[] arr, int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//
    public static void main(String[] args) {
        System.out.println("Selection Sort");

        int[] arr = new int[]{3,1,5,4,2};
        System.out.println("Array is : "+ Arrays.toString(arr));
//        selectionSort(arr);
        SelectionSort(arr);
        System.out.println("After sorting : "+Arrays.toString(arr));
    }
}
