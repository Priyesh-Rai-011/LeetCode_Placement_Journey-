package SortingAlgorithm.D_CycleSort;
// these code will not work , if duplicate elements are present in the array...!
import java.util.Arrays;

public class Theory {
    public static void main(String[] args) {
        System.out.println(" Cycle Sort ");
        int[] arr = new int[]{3,5,2,1,4};
        int[] arr2 = new int[]{3,5,2,0,1,4};
        System.out.println("Array is : "+ Arrays.toString(arr));
        cycleSort(arr);
        System.out.println("After Cycle sort : "+Arrays.toString(arr));
        System.out.println("----------------------------------------");
        System.out.println("Array is : "+Arrays.toString(arr2));
        cycleSort2(arr2);
        System.out.println("After sorting : "+Arrays.toString(arr2  ));
    }

    // for array who is sorted which is sorted from [ 1 to N ]
    static void cycleSort(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i]-1;// for (1 - N) index = element -1
            /* correct pos of elem(at index i) = val(element) -1 */
            if (arr[i] != arr[correct]){//if element at index (i) is != value of that index-1
                                        //indices :  0, 1, 2, 3, 4, 5
                                        //values  :  1, 2, 3, 4, 5, 6
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else { i++; }//if the element is at correct position......don't swap and increment the index
        }
    }
    //--------------------------------------------------------------------------------------------------
    // for array who is sorted which is sorted from [ 0 to N ]
    static void cycleSort2(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i];// for (0 - N) index = element -1
            /* correct pos of elem(at index i) = val(element) -1 */
            if (arr[i] != arr[correct]){//if element at index (i) is != value of that index
                //indices :  0, 1, 2, 3, 4, 5
                //values  :  0, 1, 2, 3, 4, 5
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else { i++; }//if the element is at correct position......don't swap and increment the index
        }
    }
    //--------------------------------------------------------------------------------------------------
//    static void cycleSort2 (int[] arr) {
//        int n = arr.length;
//
//        int i = 0;
//        while (i < n) {
//            if (arr[i] == -1 || arr[i] == i) {
//                i++;
//            } else {
//                int correctPos = arr[i];
//                if (arr[correctPos] != arr[i]) {
//                    int temp = arr[correctPos];
//                    arr[correctPos] = arr[i];
//                    arr[i] = temp;
//                } else {
//                    arr[correctPos] = -1;
//                    i++;
//                }
//            }
//        }
//    }

}
