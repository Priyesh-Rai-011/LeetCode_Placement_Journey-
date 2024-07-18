package Searching_Algo.Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class theory2_Desc_order {
    public static void main(String[] args) {
        System.out.println("ARRAY IN DESCENDING ORDER");
        int[] int_arr = new int[]{1,3,4,7,64,14,23,45,76,82,2,5,8,10};
        System.out.println(Arrays.toString(int_arr));
        Arrays.sort(int_arr);
        System.out.println(Arrays.toString(int_arr));
        int[] int_arr_rev = new int[int_arr.length];
        for (int i = 0; i<=(int_arr.length-1); i++){
            int_arr_rev[i] = int_arr[((int_arr.length-1)-i)];
        }
        System.out.println("Array in descending order is : ");
        System.out.println(Arrays.toString(int_arr_rev));

//        doing binary search
        int lBound = 0;
        int uBound = int_arr_rev.length-1;
//        -----------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element : ");
        int elem = sc.nextInt();
//        BINARY SEARCH ALGO for DESCENDING ORDER ARRAY
        while (lBound <= uBound){
            int mid_index = lBound + (uBound-lBound)/2;
            int mid_num = int_arr_rev[mid_index];
            System.out.println(mid_num+" : "+mid_index);

            if (mid_num == elem){
                System.out.println("Element found at index : "+mid_index);
                break;
            }
            else if (mid_num > elem) {
                lBound = mid_index+1;
            }
            else {
                uBound = mid_index-1;
            }
        }
    }
}
