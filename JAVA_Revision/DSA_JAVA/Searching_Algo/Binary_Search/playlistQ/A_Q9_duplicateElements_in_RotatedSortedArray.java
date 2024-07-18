// there are DUPLICATE elements in the array
// ---> find the PIVOT ELEMENT in that Array
package Searching_Algo.Binary_Search.playlistQ;

import java.util.Arrays;

public class A_Q9_duplicateElements_in_RotatedSortedArray {
    public static void main(String[] args) {
        System.out.println("Duplicate elements in Rotated sorted Array");

        int[] arr = new int[]{5, 5, 6, 6, 7, 7, 7, 8, 8, 8, 9, 1, 1, 3, 3, 3, 4, 4};
//        Arrays.sort(arr);
        System.out.println("The array is : "+Arrays.toString(arr));
        System.out.println("Pivot Element : "+arr[findPivot_with_duplicateElements(arr)]);
    }

    static int findPivot_with_duplicateElements(int[] arr) {
        int l = 0, u = arr.length - 1;

        while (l < u) {
            int mid = l + (u - l) / 2;
//            System.out.println(l);
//            System.out.println(mid);
//            System.out.println(u);
//            System.out.println("---------------");
            if (mid<u && arr[mid] > arr[mid+1]){return mid;}
            else if (mid>l && arr[mid] < arr[mid-1]) {return mid-1;}
            else if (arr[mid] == arr[l] && arr[mid] == arr[u])
                // if the elements at upperBound, lowerBound & middle are all equal
                // Eg:-  2,2,2,2,7,2,2
            {   // ===>  skip the elements
          // NOTE : What if these elements are the pivot elements themselves  ? ? ?
          // Eg:--  {2,2,2,2,2,2,0,1,1,2,2} --> pivot element is 2.
            // check if start is the pivot element
                if(arr[l] > arr[l+1]){  return l; }
                l++;
            // check if start is the pivot element
                if(arr[u] < arr[u-1]){return u-1;}
                u--;
            }
            // left side is sorted So, pivot should be in right hand side
            else if (arr[l]<arr[mid] || (arr[l]==arr[mid] && arr[mid]>arr[u])) {u = mid+1;}
            else {l = mid-1;}
        }
        return -1;
    }// PROBLEM ===>  OUTPUT NOT COMMING
}

