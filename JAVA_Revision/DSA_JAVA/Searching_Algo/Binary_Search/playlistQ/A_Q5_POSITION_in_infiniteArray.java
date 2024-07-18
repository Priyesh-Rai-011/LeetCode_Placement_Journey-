package Searching_Algo.Binary_Search.playlistQ;

import java.util.Arrays;
import java.util.Scanner;

public class A_Q5_POSITION_in_infiniteArray {
    public static void main(String[] args) {
        System.out.println("----    FINDING POSITION OF AN ELEMENT IN AN INFINITE ARRAY    ----");
        int[] arr = new int[]{8,9,2,6,7,4,5,1,10,16,81,14,15,20,27};
        Arrays.sort(arr);
        System.out.println("Array is : "+Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element : ");    int target = sc.nextInt();

        System.out.println(target+" is at index : "+ans(arr,target));
    }

    static int ans (int[] arr,int target){
    //  1)  finding the range
    //1.1) starting with subArray of size 2
        int l =0, u =1;
    //     condition for the target to lie in the range
        while (target > arr[u]){
            int l_new = u+1;
    //2) UPDATING THE VALUE of upper/lower Bound
    //      upperBound = prev_upperBound + (sizeofSubArray x 2) <-- doubling the size
            u = u + ( (u-l+1)*2 );
    //  couldn't update (l) first because we needed its old value to update (u) first
    //  vice versa
            l = l_new;
        }
        return binarySearch(arr,target,u,l);
    }
    static int binarySearch (int[] arr,int target,int u_bound,int l_bound){
        while (l_bound<=u_bound){
            int mid_index = l_bound+(u_bound-l_bound)/2;
            if (target == arr[mid_index]){
                return mid_index;
            } else if (target < arr[mid_index]){
                u_bound = mid_index-1;
            } else {
                l_bound = mid_index+1;
            }
        }
        return -1;
    }
}
