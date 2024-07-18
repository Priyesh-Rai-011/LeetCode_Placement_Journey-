package SortingAlgorithm;
//  -------------    MERGE SORT    ------------

import java.util.Arrays;

public class E_MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{8,3,4,12,5,6,7,11,2};
        System.out.println("Array is : "+ Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("After applying Merge Sort : ");
        System.out.println("Sorted array : "+Arrays.toString(arr));
    }
    static void mergeSort(int[] arr){
        if (arr.length>1){
            int mid = arr.length/2;
            int[] left = new int[mid];
            int[] right = new int[arr.length-mid];
        //  copying the elements in th left & right array
            for (int i=0; i<mid; i++){
                left[i]=arr[i];
            }
            for (int i=mid; i<arr.length; i++){
                right[i-mid]=arr[i];
            }
        //  implement merge sort to the left and right arrays
            mergeSort(right);
            mergeSort(left);
        //  merge the array
            merge(arr,left,right);
        }
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i=0,j=0,k=0;
    //  compare the elements from both the arrays
        while (i<left.length && j<right.length){
            if( left[i] <= right[j] ){
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
    //  copy remaining elements from the other array,
        while (i < left.length){
            arr[k] = left[i];
            i++;k++;
        }
        while (j < right.length){
            arr[k] = right[j];
            j++;k++;
        }
    }
}
