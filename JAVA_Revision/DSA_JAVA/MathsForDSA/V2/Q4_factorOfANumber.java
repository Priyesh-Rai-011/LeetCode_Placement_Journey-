package MathsForDSA.V2;

import java.util.Scanner;

// finding factor of a number
public class Q4_factorOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : "); int num = sc.nextInt();
        System.out.println("Factors are : ");
        factors(num);
    }
    static void factors(int num){
        for (int i=1; i<= Math.sqrt(num); i++){
            if (num%i == 0){
                if (num/i == i)/* i*i == num */{
                    System.out.println(i+" ");
                }
                else {
                    System.out.println(i+" "+num/i+"");
                }
            }
        }
    }
}
