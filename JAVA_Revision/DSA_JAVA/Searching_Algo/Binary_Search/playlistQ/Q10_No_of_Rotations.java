package Searching_Algo.Binary_Search.playlistQ;

import java.util.Arrays;

public class Q10_No_of_Rotations {
    public static void main(String[] args) {
        System.out.println("Rotated Sorted Array");
        System.out.println("Finding the number of rotations in the Array");
        int[] arr = new int[]{6, 7, 8, 10, 11, 0, 1, 3, 4, 5};
//        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Pivot element : " + pivot(arr));
        System.out.println("No. of rotations : "+rotations(arr));
    }

    static int pivot(int[] arr) {
        int l = 0, u = arr.length - 1;
        while (l <= u) {
            int mid = l + (u - l) / 2;
            if (mid < u && arr[mid] > arr[mid] + 1) {return mid;}
            else if (mid > l && arr[mid] < arr[mid] - 1) {return mid - 1;}
            else if (arr[mid] <= l) {u = mid - 1;}
            else {l = mid + 1;}
        }
        return arr[u];
    }
    static int rotations(int[] arr){
        int r;
        int l=0,    u= arr.length-1;
        while (l<=u){
            int mid = l+(u-l)/2;
            if (mid<=u && arr[mid] > arr[mid]+1)      {r=mid;  /*return  mid;*/}
            else if (mid>l && arr[mid] < arr[mid]-1) {r=mid-1;  /*return  mid-1;*/}
            else if (arr[mid] <= l)                  {u = mid-1;}
            else                                     {l = mid+1;}
        }
//        return u+1;
        r=u+1;
        if (r == arr.length){return 0;}
        return r;
    }
}
