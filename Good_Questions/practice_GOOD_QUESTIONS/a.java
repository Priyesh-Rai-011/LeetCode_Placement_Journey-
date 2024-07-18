package practice_GOOD_QUESTIONS;

public class a {
    public static void main(String[] args) {
        long n = 22L; // Note: Use "L" to indicate a long literal
        System.out.println(Long.toBinaryString(n));

        System.out.println(setBits(n));
    }

    private static int setBits(long n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n & (n - 1);
        }

        return count;
    }
}
