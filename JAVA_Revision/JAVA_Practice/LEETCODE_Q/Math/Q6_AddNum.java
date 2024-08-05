package LEETCODE_Q.Math;

public class Q6_AddNum {
    public static int addDigits(int num) {
        while (num >= 10) { // Continue until num is a single digit
            num = sumOfDigits(num);
        }
        return num;
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Add the last digit to sum
            num /= 10;       // Remove the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
//        System.out.println(38%10);      System.out.println("-"+38/10); // = 3
//        System.out.println(3%10);       System.out.println("-"+3/10);  // = 0
    }
}
