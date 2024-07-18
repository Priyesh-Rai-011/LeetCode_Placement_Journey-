package Searching_Algo.LinrearSearch.Practice;
import java.util.Arrays;

public class q8_removingDuplicateElements {
    public static void main(String[] args) {
        System.out.println("REMOVING DUPLICATE ELEMENTS FROM AN ARRAY");
        int[] int_arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 7, 9, 10, 7, 11, 12, 7, 13, 7, 14, 15, 16, 17, 18, 19, 20};
        System.out.println("The Array is : ");
        System.out.println(Arrays.toString(int_arr));


        int[] new_arr = new int[int_arr.length];
        int newSize = 0;

        for (int i = 0; i < int_arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newSize; j++) {
                if (int_arr[i] == new_arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                new_arr[newSize] = int_arr[i];
                newSize++;
            }
        }

        // Trim the array to the actual size without duplicates
        new_arr = Arrays.copyOf(new_arr, newSize);

        // displaying the new array
        System.out.println("The new array after removing duplicates is : ");
        System.out.println(Arrays.toString(new_arr));
    }
}
