package Recursion.R3;

import java.util.Arrays;
import java.util.Scanner;

class ElementNotFoundException extends Exception{
    public ElementNotFoundException(String message){
        super(message);
    }
}
public class B_LinearSearch {
    public static void main(String[] args) throws ElementNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Linear Search using recursion");
        int[] arr = new int[]{3,2,1,18,9,7,22};
        System.out.println("The Array is : "+ Arrays.toString(arr));
        System.out.println("Length of array is : "+arr.length);

        System.out.print("Target element : ");
        try {
            int target = sc.nextInt();
            System.out.println(target+" is at index : "+linearSearch(arr,target,0));
        }
        catch(ElementNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    static int linearSearch(int[] arr, int target, int index) throws ElementNotFoundException{
        if(index >= arr.length){
            throw new ElementNotFoundException("Element not present, TRY AGAIN..!");
        }

        if (arr[index] == target){
            return index;
        }
        return  linearSearch(arr, target, index+1);
    }
}
