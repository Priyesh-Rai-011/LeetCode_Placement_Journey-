package MathsForDSA.V1;

import java.util.Scanner;

public class Q3_finding_ith_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: "); int Num = sc.nextInt();
        String binaryNumber = convertToBinary(Num);
        System.out.println("Binary representation: " + binaryNumber);
//-------------------------------------------------------------------------------------------
        int intValue = Integer.parseInt(binaryNumber,2);
        System.out.println("Integer value of binary: " + intValue);
//-------------------------------------------------------------------------------------------
        System.out.print("Enter the position of the bit to find (1-based): ");int i = sc.nextInt();
        int result = findIthBit(intValue, i-1);
        System.out.println("The " + i + "-th bit from the right is: " + result);
    }
    public static String convertToBinary(int Num) {
        if (Num == 0) {return "0";}
        StringBuilder binary = new StringBuilder();
        while (Num > 0) {
            int remainder = Num % 2;
            binary.insert(0, remainder); // Add the remainder to the beginning of the string
            Num /= 2;
        }
        return binary.toString();
    }
    public static int findIthBit(int binaryNumber, int i) {
        return (binaryNumber >> i) & 1;
    }
}
