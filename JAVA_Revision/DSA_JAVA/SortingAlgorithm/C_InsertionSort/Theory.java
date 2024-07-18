package SortingAlgorithm.C_InsertionSort;

import java.util.Arrays;

public class Theory {
    static void insertionSort(int[] arr){
        for (int i=0; i< arr.length-1; i++){
            for (int j=i+1; j>0; j--){
                 if (arr[j] < arr[j-1]){
                    //swapping the elements
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else {
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(" Insertion Sort ");
        int[] arr = new int[]{97,8,3,2,4,8,-7,-1,23,-8,9,0};
//        int[] arr = new int[]{-9,-8,-7,-5,-4,-3,-1,-3,-4};
//        int[] arr = new int[]{15,10};
//        int[] arr = new int[]{8,7,4,5,0,2,1,3};
//        int[] arr = new int[]{};
        System.out.println("Array is : "+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Insertion sort : "+Arrays.toString(arr));
    }
}
