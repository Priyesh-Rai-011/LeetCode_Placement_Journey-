package MathsForDSA.V1;

import java.util.ArrayList;
import java.util.Scanner;
// Q). There is an array in which every element occurs EVEN number of times
//     one element occurs only 1 time
//     Find that number
// Eg:- Arr [4,6,3,5,2,6,4,5,3]
//      ans :- 2
public class Q2_SingleOccurredElement_InArray_OtherElementsOccurs_EvenTimes {
    public static void main(String[] args) {
        System.out.println("Finding the element in an array which occurred only one time in the Array");

        ArrayList<Integer> arr = createArr();
        System.out.println("The array is :   "+arr);

        System.out.println("The unique element in the array is :  "+singleOcc(arr));
    }
// function to just create the array
    static ArrayList<Integer> createArr(){
        System.out.println("Enter the elements of the Array : ");Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        while (true){
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("done")){    break;  }
            int elem = Integer.parseInt(input);
            arr.add(elem);
        }
        return arr;
    }

// function to find the unique element in the array
    static int singleOcc(ArrayList<Integer> arr){
        int unique = 0;
        for (int elem : arr){  unique ^= elem;  }
        return unique;
    }
}
