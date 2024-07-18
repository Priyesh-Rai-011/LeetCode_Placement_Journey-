package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class al_ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> intarr = new ArrayList<>();
        System.out.println("Enter the integers in the array (enter 'done' to submit ) : ");

        while (true){
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("done")){
                break;
            }
            int int_element = Integer.parseInt(input);
            intarr.add(int_element);
        }
        System.out.println("The ArrayList is as follows : ");
        System.out.println(intarr);

        System.out.println("----------------------------------------------------------------");

        for (Integer elem : intarr){
            System.out.print(elem+", ");
        }        System.out.println();
    }
}
