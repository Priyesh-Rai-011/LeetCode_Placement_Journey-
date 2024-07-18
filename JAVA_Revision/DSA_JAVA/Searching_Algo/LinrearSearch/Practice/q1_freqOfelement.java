package Searching_Algo.LinrearSearch.Practice;
import java.util.ArrayList;
import java.util.Scanner;
public class q1_freqOfelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----  Finding the frequency of the element  ----");
        ArrayList<Integer> int_arr = new ArrayList<>();
        System.out.println("Enter the input elements if the array : ");
        while (true){
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("done")){
                break;
            }
            int number = Integer.parseInt(input);
            int_arr.add(number);
        }
//        ---------------------------------------
        System.out.println("The array is : ");
        System.out.println(int_arr);
//        ---------------------------------------
        System.out.print("Enter the element you want to find the occurrence of : ");
        int elem = sc.nextInt();
        int count = 0;
        for (Integer i : int_arr) {
            if (elem == i) {
                count++;
            }
        }
        if (count > 0){
            System.out.println("The element occurred for "+count+" times.");
        }
        else {
            System.out.println("Teh element is not present in the array");

        }
    }
}
