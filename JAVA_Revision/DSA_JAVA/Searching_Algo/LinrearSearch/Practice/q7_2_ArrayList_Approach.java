package Searching_Algo.LinrearSearch.Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class q7_2_ArrayList_Approach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eliminating all the occurrences of an element in an Array");
        ArrayList<Integer> int_arr = new ArrayList<>(10);

        System.out.println("Array inputs : ");
        while (true){
            int input = sc.nextInt();
            if (input == -1){
                break;
            }
            int_arr.add(input);
        }

        System.out.print("The Array is : ");
        System.out.println(int_arr);

//  --------------------------------------------------------
//        using a new array to store the filtered elements
//  ---------------------  Approach 1  ---------------------
        System.out.print("Enter eliminating element :");
        int target = sc.nextInt();

//        List<Integer> new_int_arr = new ArrayList<>();
//        for (Integer elem : int_arr){
//            if (elem != target){
//                new_int_arr.add(elem);
//            }
//        }
//        System.out.println(new_int_arr);
//  --------------------------------------------------------
//        didn't used a new array ---- space complexity saved
//  ---------------------  Approach 2  ---------------------
        for (int i=0; i< int_arr.size(); i++){
            if (int_arr.get(i) == target){
                int_arr.remove(i);
                i--;
            }
        }
        System.out.println(int_arr);
    }
}
