package Searching_Algo.LinrearSearch.Practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class q8_1_ArrayListApproach {
    public static void main(String[] args) {
        System.out.println("REMOVING DUPLICATE ELEMENTS FROM AN ARRAY");
        int[] int_arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 7, 9, 10, 7, 11, 12, 7, 13, 7, 14, 15, 16, 17, 18, 19, 20};
        System.out.println("The Array is : ");
        System.out.println(Arrays.toString(int_arr));

        List<Integer> newList = new ArrayList<>();
        for (int num : int_arr) {
            if (!newList.contains(num)) {
                newList.add(num);
            }
        }

        int[] new_arr = new int[newList.size()];
        for (int i = 0; i < new_arr.length; i++) {
            new_arr[i] = newList.get(i);
        }

        // displaying the new array
        System.out.print("The new array after removing duplicates is : ");
        System.out.println(Arrays.toString(new_arr));
    }
}
