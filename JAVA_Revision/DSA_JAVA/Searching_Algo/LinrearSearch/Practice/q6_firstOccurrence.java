package Searching_Algo.LinrearSearch.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class q6_firstOccurrence {
    public static void main(String[] args) {
        System.out.println("FINDING THE FIRST OCCURRENCE OF AN ELEMENT IN AN ARRAY");
        int[] int_arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println("The Array is : ");
        System.out.println(Arrays.toString(int_arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element : ");
        int elem = sc.nextInt();
        for (int i=0; i< int_arr.length; i++){
            if (i == elem){
                System.out.println(elem+" first occurred at index "+int_arr[i]);
            }
            else {
                System.out.println("Element not present...!!");
            }
            break;
        }
        System.out.println("-------------------------");
    }
}
