package Searching_Algo.LinrearSearch.Practice;
import java.util.Arrays;
//import java.util.Scanner;
//import java.util.ArrayList;
public class q4_sum_Of_Elem {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        System.out.println("FINDING THE SUM OF THE ELEMENTS OF THE ARRAY");
//        ArrayList<Integer> int_arr = new ArrayList<>(10);

//        System.out.println("Enter the input element of the Array :");
        int[] int_arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println("The Array is : ");
        System.out.println(Arrays.toString(int_arr));

//        ------------------------------------------------
        int sum = 0;
        for (int i : int_arr){
            sum = sum+i;
        }
        System.out.println("The sum of the elements of the array is :"+sum);
    }
}
