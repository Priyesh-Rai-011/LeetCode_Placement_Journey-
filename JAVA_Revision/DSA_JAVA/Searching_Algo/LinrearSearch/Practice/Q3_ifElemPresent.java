package Searching_Algo.LinrearSearch.Practice;
import java.util.Scanner;
import java.util.ArrayList;
public class Q3_ifElemPresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CHECKING IF THE ELEMENT IS PRESENT IN THE ARRAY");
        ArrayList<Integer> int_arr = new ArrayList<>(10);

        System.out.println("Enter the elements of the Array : ");
        while (true){
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("")){
                break;
            }
            int number = Integer.parseInt(input);
            int_arr.add(number);
        }

        System.out.print("The Array is : ");
        System.out.println(int_arr);

        System.out.print("Enter the element you want to find in the Array : ");
        int target = sc.nextInt();
        boolean is_present = false;
        for (Integer i : int_arr){
            if (i == target){
                is_present = true;
                break;
            }
        }
        if (is_present){
            System.out.println("The element "+target+" is present in the Array...!!");
        }
        else {
            System.out.println("Element is not present in the Array ..!");
        }
    }
}
