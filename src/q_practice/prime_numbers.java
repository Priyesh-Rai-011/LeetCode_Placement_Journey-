package q_practice;
import java.util.Scanner;
public class prime_numbers {
    public static void main(String[] args) {
        System.out.println("Enter length of the array");
        Scanner sc = new Scanner(System.in);
        int l= sc.nextInt();
        int[] arr = new int[l];
        System.out.println("enter the elements of the array :");
        for (int i=0;i<l;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("----------------------------------");
        for (int i=0;i<l;i++){
            boolean isPrime=true;
            for (int j=2;j<i;j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                if (isPrime){
                    System.out.println(i+" are the prime numbers in the array");
                }
            }
        }
    }
}
