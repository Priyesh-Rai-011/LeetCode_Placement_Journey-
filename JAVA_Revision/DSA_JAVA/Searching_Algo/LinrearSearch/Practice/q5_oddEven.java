package Searching_Algo.LinrearSearch.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q5_oddEven {
    static void oddEven(int[] arr){
        int odd_count =0, even_count=0;

        List<Integer> even_elem = new ArrayList<>();
        List<Integer> odd_elem = new ArrayList<>();
        for (int i : arr) {
            if (i % 2 == 0) {
                even_count++;
                even_elem.add(i);
            } else {
                odd_count++;
                odd_elem.add(i);
            }
        }
        System.out.println("Even elements are : "+even_elem);
        System.out.println("There are "+even_count+" even elements in the Array.");
        System.out.println("----------------------------------------------");
        System.out.println("Odd elements are : "+odd_elem);
        System.out.println("There are "+odd_count+" odd elements in the Array.");
    }
    public static void main(String[] args) {
        System.out.println("FINDING THE NUMBER OF ODD AND EVEN NUMBERS IN AN " +
                "ARRAY");
        int[] int_arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println("The Array is : "+Arrays.toString(int_arr)+"\n");
//-------------------------------------------------------
        oddEven(int_arr);
    }
}
