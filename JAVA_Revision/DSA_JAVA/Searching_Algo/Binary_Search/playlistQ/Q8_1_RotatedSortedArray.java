package Searching_Algo.Binary_Search.playlistQ;
// FINDING PIVOT ELEMENT IN THE ARRAY
import java.util.Arrays;

public class Q8_1_RotatedSortedArray {
    public static void main(String[] args) {
        System.out.println("----  FINDING THE PIVOT ELEMENT IN (ROTATED SORTED ARRAY)   ----");
//        int[] arr = new int[] {5,7,8,11,20,21,22,27,0,1,3,4};
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        System.out.println("Array is : "+ Arrays.toString(arr));
        if (pivot(arr) != -1){
            System.out.println("Pivot element : "+arr[pivot(arr)]);
        }
        else {
            System.out.println("ERROR : NO PIVOT");
        }
//        System.out.println(arr[8]);
    }
    static int pivot(int[] arr){
        int l=0,    u= arr.length-1;
        while (l<=u){
            int mid = l+(u-l)/2;
//            System.out.println(l);
//            System.out.println(mid);
//            System.out.println(u);
//            System.out.println("----------");
            if (mid<u && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if (mid>l && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            else if (arr[mid] <= arr[l]) {
                u = mid-1;
            }
            else {
                l = mid+1;
            }
        }
        return u;
    }
}
