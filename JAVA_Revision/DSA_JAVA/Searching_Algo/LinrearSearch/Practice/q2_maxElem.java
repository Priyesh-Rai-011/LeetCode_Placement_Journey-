package Searching_Algo.LinrearSearch.Practice;
import java.util.Scanner;
import java.util.ArrayList;
public class q2_maxElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----  Finding the maximum element of the Array  ----");
        ArrayList<Integer> int_arr = new ArrayList<>(10);

        System.out.println("Enter the input elements of the Array : ");
        while (true){
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("")){
                break;
            }
            int number = Integer.parseInt(input);
            int_arr.add(number);
        }
//        -----------------------------------------------------------
        System.out.println("The Array is : ");
        System.out.println(int_arr);
//        -----------------------------------------------------------
//        FINDING THE MAXIMUM ELEMENT OF THE ARRAY
        int max = Integer.MIN_VALUE;
        for (Integer integer : int_arr) {
            if (integer > max) {
                max = integer;
            }
        }
        System.out.println("The maximum element of the Array is : "+max);
//        -----------------------------------------------------------
//        FINDING THE MINIMUM ELEMENT OF THE ARRAY
        int min = Integer.MAX_VALUE;
        for (Integer integer : int_arr){
            if (integer < min){
                min = integer;
            }
        }
        System.out.println("The minimum element in the Array is : "+min);
    }
}
