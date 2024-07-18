package Methods;
import java.util.Scanner;

public class Q6_max {
    static void findMax(int[] arr){
        int max = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The max value of the array is : "+max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----  Max element in the array  ----");
        System.out.print("Enter the length of the array : ");
        int l = sc.nextInt();
        int[] arr = new int[l];

        System.out.println("Enter the elements in the array : ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("The array is : ");
        for (int elem : arr) {
            System.out.print(elem + ", ");
        }System.out.println();


        findMax(arr);
    }
}
