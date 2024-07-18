package Searching_Algo.LinrearSearch.Practice;
import java.util.Scanner;
import java.util.Arrays;
public class q7_removingAllOccurences {
    public static void main(String[] args) {
        System.out.println("REMOVING ALL THE OCCURRENCES IN AN ARRAY");
        int[] int_arr = new int[]{1,2,3,4,5,6,7,8,7,9,10,7,11,12,7,13,7,14,15,16,17,18,19,20};
        System.out.println("The Array is : ");
        System.out.println(Arrays.toString(int_arr));

        System.out.println("Enter the element : ");
        Scanner sc = new Scanner(System.in);
        int elem = sc.nextInt();
//----------------------------------------------------------------
        int count = 0;
        for (int i=0; i< int_arr.length; i++){//iterating through the array
            if (int_arr[i] == elem){
                count++;
            }
        }
//----------------------------------------------------------------
        int[] new_arr = new int[int_arr.length-count];//creating a new array for the updated array
        int index = 0;
        for (int num : int_arr){
            if (num != elem){        // if element in the array is not the element you want to eliminate
                new_arr[index] = num;// add that element to the new array to the new assigned index
                index++;             // incrementing the index
            }
        }
//        displaying the new array
        System.out.print("The new array is : ");
        System.out.println(Arrays.toString(new_arr));
    }
}
