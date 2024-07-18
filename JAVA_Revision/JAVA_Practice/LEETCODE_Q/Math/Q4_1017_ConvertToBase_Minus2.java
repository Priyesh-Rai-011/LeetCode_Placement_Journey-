package LEETCODE_Q.Math;

public class Q4_1017_ConvertToBase_Minus2 {
    public static String baseNeg2(int n) {
        if (n==0){
            return "0";
        }
        int k=1;//coefficient
        StringBuilder ans = new StringBuilder();
        while(n!=0){
            if (n%2==0){
                ans.append(0);
            }
            else if (n%2!=0) {
                ans.append(1);
                n=n-k;
            }
            k = k*-(1);
            n=n/2;
        }
        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(baseNeg2(16));
        System.out.println("-------------");
        System.out.println(baseNeg2(13));
        System.out.println("-------------");
        System.out.println(baseNeg2(3));
        System.out.println("-------------");
        System.out.println(baseNeg2(4));
        System.out.println("-------------");
        System.out.println(baseNeg2(4));
    }
}
