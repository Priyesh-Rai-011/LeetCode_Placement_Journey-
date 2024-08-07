package LEETCODE_Q.String;

public class Q11_DigitSum_String {
    public static String digitSum(String s, int k) {
        while (s.length()>k){
            int n=s.length();
            StringBuilder t = new StringBuilder();
            for (int i=0; i<n; i=i+k){
                int val=0;
                for (int j=i; j<Math.min(i+k,n); j++){
                    val+=s.charAt(j)-'0';
                }
                t.append(val);
            }
            s=t.toString();
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(digitSum("11111222223",3));
        System.out.println(digitSum("000000000000",3));
    }
}
