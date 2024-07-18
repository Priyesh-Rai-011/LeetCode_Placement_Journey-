package MathsForDSA.V1;

import java.util.Scanner;

public class _addTwoBinaryNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter two binary numbers :"); int a = sc.nextInt(), b=sc.nextInt();
        System.out.println("Sum of these number in binary format is : ");
    }
    public String addBinary(String a, String b) {
        var sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        for (int carry = 0; i >= 0 || j >= 0 || carry > 0; --i, --j) {
            carry += (i >= 0 ? a.charAt(i) - '0' : 0) + (j >= 0 ? b.charAt(j) - '0' : 0);
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}
