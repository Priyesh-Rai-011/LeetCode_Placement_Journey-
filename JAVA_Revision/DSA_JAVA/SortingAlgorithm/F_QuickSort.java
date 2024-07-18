package SortingAlgorithm;

import java.util.Arrays;

public class F_QuickSort {
    public static void main(String[] args) {
//        int[] arr = new int[]{10, 8, 3, 4, 12, 5, 6, 7, 11, 2, 1, 9};
        int[] arr = new int[]{8,9,0,8,7,5,4,3,2,21,35,67,89,80,12,56,23,873,498,327,632,623,80,79,23,98,34,9087,6543,2145,6789,0732,1467,8907,5342,5789,7865,5634,3546,890,78,6652,53565,78906,576,43};
//        int[] arr = new int[]{10, 8, 3, 4, 12, 13, 18, 20, 5, 6, 7, 11, 2, 1, 9  };

        System.out.println("Array is : "+ Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("After Quick Sort");
        System.out.println("Array is : "+Arrays.toString(arr));
    }

    private static void quickSort(int[] arr,int l,int h) {
        if (l<h){
        //  pivot element, pivot element is at the right position
            int pivot = partition(arr, l, h);
        //  apply quick sort to left and right half of partition
            quickSort(arr,l,pivot-1);
            quickSort(arr, pivot+1, h);
        }
    }

    private static int partition(int[] arr, int l, int h) {
        int pivot = arr[l];   int i=l, j=h;
        while (i<=j){
            for (int k=i; k<arr.length; k++){
                if (arr[k]>pivot){
                    i=k;
                    break;
                }
            }
            for (int k=j; k>=0; k--){
                if (arr[k]<=pivot){
                    j=k;
                    break;
                }
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j--;
            }
        }
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;

        return j;
    }
}
