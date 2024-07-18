package MathsForDSA.V1;
// suppose we are taking base = 2; ---> binary number
// Eg : n=10
// in binary format .... it is written as (10)base10 = (1010)base2
// SO, in binary format 10 is written by using 4 bits
// Thus,
//Q). For a given number we have to find that... how many bits are used to write those number in binary format ?
import java.util.Scanner;

public class Q6_noOfDigitsInBase_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");  int n = sc.nextInt();
        System.out.println(n+" in binary format : "+toBinary(n));

        int bits = (int)(Math.log(n)/Math.log(2)) + 1;
        System.out.println(n+" is written using "+bits+" bits.");
    }
    static String toBinary(int n){
        StringBuilder binary = new StringBuilder();
        if (n == 0){return "0";}
        while (n>0){
            int rem = n%2;
            binary.insert(0,rem);
            n/=2;
        }
        return binary.toString();
    }
}
