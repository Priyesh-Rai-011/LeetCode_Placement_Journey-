package MathsForDSA.V1;

import java.util.Scanner;

// Finding if a number is even or odd by using bitwise operator
public class Q1_OddEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Finding if a number is even or odd by using bitwise operator");
        System.out.print("Enter the number : ");    int num = sc.nextInt();
        OddEven(num);

        sc.close();
    }
    static void OddEven(int num){
        if ((num & 1) == 0){
            System.out.println(num+" is Even....!");
        }
        else {
            System.out.println(num+" is Odd....!");
        }
    }
}
