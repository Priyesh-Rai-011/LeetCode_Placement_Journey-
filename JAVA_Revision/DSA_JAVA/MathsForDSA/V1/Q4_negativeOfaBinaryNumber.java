package MathsForDSA.V1;
// 1). Enter a number in decimal format
// 2). Convert the number to binary format
// 3). calculate the negative of that number
// 4). Represent the negative number in binary format
import java.util.Scanner;

public class Q4_negativeOfaBinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : "); int num = sc.nextInt();
        String binaryRep = convertToBinary(num);
        System.out.println("Binary rep : "+binaryRep);
    // ---------------------------------------------------------------
        System.out.println("-----------------------------------------");
        System.out.println("Negative of tat number is : "+ -num);
        String negBinaryRep = twosComplement(binaryRep);
        System.out.println("Binary representation is :"+negBinaryRep);
    }
    static String convertToBinary(int num){
        if (num == 0){ return "0"; }
        StringBuilder binary = new StringBuilder();
        while (num > 0){
            int rem = num%2;
            binary.insert(0,rem);
            num /= 2;
        }
        return binary.toString();
    }
    static String twosComplement(String binaryNumber) {
        // Step 1: Find the one's complement
        StringBuilder onesComplement = new StringBuilder();

        for (int i = 0; i < binaryNumber.length(); i++) {
            char bit = binaryNumber.charAt(i);

            if (bit == '0') {
                onesComplement.append('1');
            } else if (bit == '1') {
                onesComplement.append('0');
            } else {
                System.err.println("Invalid input. Please enter a binary number.");
                return "";
            }
        }

        // Step 2: Add 1 to the one's complement
        StringBuilder twosComplement = new StringBuilder();
        int carry = 1; // Initialize carry to 1

        for (int i = onesComplement.length() - 1; i >= 0; i--) {
            char bit = onesComplement.charAt(i);

            if (bit == '0' && carry == 1) {
                twosComplement.insert(0, '1');
                carry = 0;
            } else if (bit == '1' && carry == 1) {
                twosComplement.insert(0, '0');
            } else {
                twosComplement.insert(0, bit);
            }
        }

        return twosComplement.toString();
    }
}
