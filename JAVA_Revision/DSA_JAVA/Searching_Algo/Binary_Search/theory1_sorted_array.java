package Searching_Algo.Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class theory1_sorted_array {
    public static int binarySearch(int[] numbers,int numTOfind){
        int lowerBound = 0;
        int upperBound = (numbers.length-1);
        while (lowerBound <= upperBound){
            int midIndex = (upperBound+lowerBound)/2;
            int midNumber = numbers[midIndex];

            if (numTOfind == midNumber){
                return midIndex;
            } else if (numTOfind < midNumber) {
                upperBound = midIndex-1;
            }
            else {
                lowerBound = midIndex+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("----  BINARY SEARCH  ----");
        int[] int_arr = new int[]{1,2,3,5,6,7,9,11,13,15,17,21};
        System.out.println("The Array is : "+ Arrays.toString(int_arr));


        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("MENU");
            System.out.println("1). Find the number");
            System.out.println("2). Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.print("Enter the element : ");
                    int elem = sc.nextInt();
                    int index = binarySearch(int_arr, elem);
                    if (index != -1) {
                        System.out.print("The element is at index : " + index + "\n");
                    } else {
                        System.out.println("Element not present in the array...!");
                    }
                }
                case 2 -> exit = true;
                default -> System.out.println("Wrong choice : Try again ...!!");
            }
        }
        sc.close();
    }
}
