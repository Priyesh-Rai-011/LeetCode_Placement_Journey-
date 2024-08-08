package LEETCODE_Q.String;

public class Q13_ShiftingLetters {
    public static String shiftingLetters(String s,int[] shifts){
        char[] result = s.toCharArray();
        int t=0, n=s.length();
        for (int i=n-1; i>=0; i--){
            t+=shifts[i];
            result[i]+=t;
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(shiftingLetters("priy",new int[]{1,2,3,4}));
    }
}
