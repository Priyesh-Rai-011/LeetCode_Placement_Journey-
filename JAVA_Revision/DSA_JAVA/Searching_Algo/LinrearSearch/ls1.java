package Searching_Algo.LinrearSearch;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
//  PROBLEM
//    This will return the index of only first occurance of the element
public class ls1 {
    public static int linearSearch(ArrayList<Integer> arr,int elem){
        for (int i=0; i<arr.size(); i++){
            if (arr.get(i) == elem){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Linear search : ");
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> int_arr = new ArrayList<>(10);
        System.out.println("Enter elements of the array ( enter 'done' to submit )");

        while (true){
            String element = sc.nextLine();
            if (element.equalsIgnoreCase("done")){
                break;
            }
            int int_elem = Integer.parseInt(element);
            int_arr.add(int_elem);
        }
        System.out.print("Array is : ");
        System.out.println(int_arr);

//        ------------------------------------
        System.out.print("\nEnter the element you want ot find in the array : ");
        int e = sc.nextInt();
        System.out.println("Finding where is the element "+e+" in the Array : ");
        System.out.println("Element is present at index : "+linearSearch(int_arr,e));

        System.out.println("\n    FINISH");
    }
}
