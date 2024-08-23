package Leetcode_GOOD_QUESTIONS;

public class Q8_592_Fraction_AddSub {
    static String fractionAddition(String expression) {
        int num = 0;
        int den = 1;
        // separate expression into signed numbers
        String[] nums = expression.split("/|(?=[+-])");
//        System.out.println("-->" + Arrays.toString(nums));
        for (int i=0; i<nums.length; i=i+2){
            int currNum = Integer.parseInt(nums[i]);
            int currDen = Integer.parseInt(nums[i+1]);

            num = num*currDen + currNum*den;
            den = den * currDen;
        }
        int g = Math.abs(gcd(num,den));
        num /= g;
        den /= g;
        return  num+"/"+den;
    }
    static int gcd(int a, int b){
        return (a==0) ? b : gcd(b%a, a);
    }
    public static void main(String[] args) {
        System.out.println(fractionAddition("1/4-1/3-1/2+1/2"));
        System.out.println(fractionAddition("1/2+1/3-1/2"));
        System.out.println(fractionAddition("1/2-1/2"));
        System.out.println(fractionAddition("-1/3+1/5+1/2"));
//        System.out.println(gcd(-4,20));
//        System.out.println(gcd(4,-20));
//        System.out.println(gcd(-4,-20));

    }
}
