package LEETCODE_Q.String;

public class Q12_LexicoGraphicallySmallestString {
    public static String smallestString(String s) {
        int n=s.length();
        int i=0;
        while (i<n && s.charAt(i)=='a'){
            i++;
        }
        if (i==n){
            return s.substring(0,n-1)+'z';
        }
        int j=i;
        char[] result = s.toCharArray();
        while (j<n && s.charAt(j)!='a'){
            result[j]--;
            j++;
        }
        return String.valueOf(result);
    }
    public static void main(String[] args) {
        System.out.println(smallestString("aaaaaa"));
        System.out.println(smallestString("aaesrdxfcaaardtfvgy"));
        System.out.println(smallestString("priyeshrai"));
    }
}
