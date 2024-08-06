package LEETCODE_Q.Math;

public class Q7_SumDigitStringAfterConvert {
    public static int getLucky(String s, int k) {
        int ans = convert(s);
        for (int i = 1; i < k; i++) {
            ans = getDigitSum(ans);
        }
        return ans;
    }
    private static int convert( String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            // Do one transform to prevent integer overflow.
            sum += getDigitSum(c-'a'+1);
        }
        return sum;
    }
    public static int getDigitSum(int num){
        int ans=0;
        while (num>0){
            ans += (num%10);
            num /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getLucky("leetcode",2));
        System.out.println(getLucky("priyeshrai",7));
        System.out.println(getLucky("pravinrai",11));
    }
}
