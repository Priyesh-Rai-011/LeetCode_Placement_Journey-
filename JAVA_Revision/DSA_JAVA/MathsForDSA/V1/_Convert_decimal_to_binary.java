package MathsForDSA.V1;

import java.util.Scanner;

// Convert a decimal number to binary number
public class _Convert_decimal_to_binary {
//    static int rightshift(int num){
//        return num >> 1;
//    }
    public static void main(String[] args) {
//        int binary  = 0b1101010;
//        System.out.println("Binary number is : "+binary);
//
//        int newBinaryNumber =  rightshift(binary);
//        System.out.println("Binary number after right shift is : "+newBinaryNumber);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Decimal Number : ");    int dec_num = sc.nextInt();

        String bin_num = convertToBinary(dec_num);

        System.out.println("The Binary equivalent is : "+bin_num);
    }

    static String convertToBinary(int decNum) {
        if (decNum == 0 ){return "0";} // special case for zero "0"
        StringBuilder binNum = new StringBuilder();

        while (decNum > 0){
            int rem = decNum%2;
            binNum.insert(0, rem); // Add the remainder to the left of the binary string
                                    // When you add an integer to a string in Java,
                                    // Java performs an implicit type conversion,
                                    //turning the integer into its string representation, and then performs the string concatenation.
            decNum /= 2;
        }
        return binNum.toString();
    }
}
