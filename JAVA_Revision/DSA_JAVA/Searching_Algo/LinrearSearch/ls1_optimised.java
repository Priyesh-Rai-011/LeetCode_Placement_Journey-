package Searching_Algo.LinrearSearch;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ls1_optimised {
    public static void addElem(ArrayList<Integer> int_arr){
        Scanner sc = new Scanner(System.in);
        while (true){
            String input = sc.nextLine();//taking input as a string
            if (input.equalsIgnoreCase("done")){
                break;//breaking the input loop until done is given as input
            }
            int number = Integer.parseInt(input);//converting string val to corresponding integer val.
            int_arr.add(number);//adding the converted input items to Array-list
        }
    }
    public static void display(ArrayList<Integer> int_arr){
        System.out.println(int_arr);// displaying the array-list
    }
    public static void linearSearch(ArrayList<Integer> int_arr,int val){
        List<Integer> indices = new ArrayList<>();
//        loop
        for (int i=0; i< int_arr.size(); i++){
            if (int_arr.get(i) == val) {
                indices.add(i);//add the indices to a new array-list
            }
        }
        if(indices.isEmpty()){
            System.out.println("ERROR : The element is not in the Array");
        }
        else {
            System.out.println("The element is present at index/indices : "+indices);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("LINEAR SEARCH");
        ArrayList<Integer> int_arr = new ArrayList<>(10);
        System.out.println("Enter the elements of the ArrayList : ");
        addElem(int_arr);
        System.out.println("------------------------------------------");
        display(int_arr);
        System.out.println("------------------------------------------");
        System.out.print("Enter the element you want to search in the Array : ");
        int num = sc.nextInt();
        linearSearch(int_arr,num);
    }
}
