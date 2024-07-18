package MathsForDSA.V2;

import java.util.Scanner;

public class Q1_PrimeNumber {
    static Exception e = new Exception("EXCEPTION || Not a valid input..!");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");    int num = sc.nextInt();
        System.out.println("There are "+countPrimes(num)+" prime numbers btw 1 - "+num);
//        System.out.println("Checking if a number is prime or not.... ?");
//
//        for (int i=1; i<=20; i++){
//            System.out.println(i+" - "+isPrime(i));
//        }
}
//    static boolean isPrime(int n){
//        if (n<0){e.getMessage();}
//        else if (n==0) {System.out.println("0 is neither prime nor composite");}
//        for (int c=2 ; c<= Math.sqrt(n); c++){
//            if (n%c == 0){
//                return false;
//            }
//        }
//        return true;
//    }
    public static int countPrimes(int n) {
        int count = 0;
        if (n < 0) {
            return 0;
        }
        else if (n==1){
            return 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int c = 2; c <= Math.sqrt(i); c++) {
                if (n % c == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
