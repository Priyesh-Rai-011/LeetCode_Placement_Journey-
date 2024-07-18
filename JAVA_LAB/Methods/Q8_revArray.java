package Methods;
import javax.xml.transform.Source;
import java.util.Scanner;

public class Q8_revArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----  Reverse an Array  ----");
        System.out.print("Enter the length of Array : ");
        int l = sc.nextInt();
        int[] arr = new int[l];
//  giving input to the array
        System.out.println("Enter teh input element of the array");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
//  displaying the array
        System.out.print("Array is -:  ");
        for (int elem : arr){
            System.out.print(elem+", ");
        }        System.out.println();
//  reversing an array     (creating a new array and storing th e value of the old array in the new one)
        int[] arr2 = new int[l];
        for (int i=0; i<arr.length; i++){
            arr2[i] = arr[(arr.length-1)-i];
        }
//  displaying the reversed array
        System.out.print("Reversed array is : ");
        for (int elem : arr2){
            System.out.print(elem+", ");
        }        System.out.println();
//  _____________________________________________________
//  -----------------------------------------------------
//  reversing an array     (reversing the original array)
//  -----------------------------------------------------
//  _____________________________________________________
        System.out.println("----------------------------");
        System.out.println("REVERSING THE ORIGINAL ARRAY");
        System.out.println("----------------------------");
        for (int i=0; i<=((arr.length-1)/2); i++){
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = temp;
        }
        System.out.print("Array is -:  ");
        for (int elem : arr){
            System.out.print(elem+", ");
        }        System.out.println();
    }
}
