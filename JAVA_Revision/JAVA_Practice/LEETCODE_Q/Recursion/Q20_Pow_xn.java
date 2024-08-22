package LEETCODE_Q.Recursion;

public class Q20_Pow_xn {
    static double myPow(double x, int n) {
        if (n == 0) {return 1;}
        if (n < 0) {
            x = 1 / x;
            if(n==Integer.MIN_VALUE){
                x=x*x;
                n=n/2;
            }
            n = -n;
        }
        // long longN = n; // Convert n to long
        // double halfPow = myPow(x, longN / 2);
        double halfPow = myPow(x, n / 2);
        // if (longN % 2 == 0) {
        if (n % 2 == 0) {
            return halfPow * halfPow;
        } else {
            return x * halfPow * halfPow;
        }
    }
    public static void main(String[] args) {
        System.out.println(myPow(2,3));
    }
}
