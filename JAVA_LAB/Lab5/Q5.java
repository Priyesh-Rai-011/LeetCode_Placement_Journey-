package Lab5;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        System.out.println("-- Occurrence of an element --");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");      int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array : ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }                                                                                          System.out.println();
        System.out.print("Array is : ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+",");
        }                                                                                          System.out.println();
        System.out.print("Enter the element : ");      int elem = sc.nextInt();
        int count=0;
        for (int i=0; i<n; i++){
            if (arr[i] == elem){
                count++;
            }
        }
        System.out.println(elem+" occurred in the array for "+count+" times..!");
    }
}
