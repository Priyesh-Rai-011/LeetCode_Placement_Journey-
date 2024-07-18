package Lab5;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        System.out.println("-- Odd & Even in an array --");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array : ");
        for (int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Array is :");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+",");
        }        System.out.println();
        int ct_odd=0,ct_even=0;
        for (int i=0; i<n; i++){
            if (arr[i]%2==0){ct_even++;}
            else            {ct_odd++; }
        }
        System.out.println("No. of even elements :"+ct_even);
        System.out.println("No. of odd elements :"+ct_odd);
    }
}