package SortingAlgorithm.A_BubbleSort;
//  Bubble sort -
//  Also known as - sinking sort / exchange sort
//  0,1,2,3 , 4, 5, 6, 7, 8, 9 --> indices
//  9,8,7,23,23,98,72,14,69,27
//  8,7,9,23,23,14,72,69,27,98 --> 1st pass     --> with every pass the largest element in the unsorted array, gets to the end
//  7,8,9,23,14,23,69,27,72,98 --> 2nd pass
//  7,8,9,14,23,23,27,69,72,98 --> 3rd pass


import java.util.Arrays;

public class Theory {
    public static void main(String[] args) {
        System.out.println("Bubble Sort");

//        int[] arr = new int[]{9,8,7,23,23,98,72,14,69,27};
//        int[] arr = new int[]{1,2,3,4,5};
//        int[] arr = new int[]{-2,13,-6,5,98,-8,9,7,-23,-4,-9,-8};
        int[] arr = new int[]{-2,13,5,98,1,3,0,-8,-4,-9};
        System.out.println("Array is : "+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After swapping : ");
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i=0; i< arr.length-1; i++){
            swapped = false;//--> to check if no swap has occurred
            // for each step, max item will come at the last respective index
            for (int j=1; j< arr.length-1-i; j++){
                if (arr[j] < arr[j-1]){// swap if the item is smaller than the previous one
                // swapping arr[j] with arr[j-1]
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;//--> swap occurred == so, swapped will be true
                }
            }
            // if you didi not swap for a particular value of i,
            // it means the array is sorted hence stop the program
            if (!swapped){// if swapped is false (if the array is already sorted)
                break;    // it means no swap has occurred in the 1st iteration -> no need to waste time in repetitive checking
            }
        }
    }
}
