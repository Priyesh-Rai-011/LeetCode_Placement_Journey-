package Searching_Algo.LinrearSearch;
import java.util.ArrayList;
import java.util.Scanner;
public class ls_minElem {
    public static void min_elem(ArrayList<Integer> arr){
        int min = arr.get(0);
        for (int i=0; i< arr.size(); i++){
            if (arr.get(i) < min){
                min = arr.get(i);
            }
        }
        System.out.println("The minimum element of the Array is : " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Finding the minimum element in the Array ");

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the  elements in the Array : ");
        while (true){
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("done")){
                break;
            }
            int number = Integer.parseInt(input);
            arr.add(number);
        }

        System.out.println("The Array is : ");
        System.out.println(arr);

        min_elem(arr);
    }
}
