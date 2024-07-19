package LEETCODE_Q.DYNAMIC_PROGRAMMING;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;

public class Q3_1653 {
    public static int minimumDeletions(String s) {
        int[] dp = new int[s.length()];
//        ArrayList<Character> arrlsts = new ArrayList<>();
        char[] arrs = s.toCharArray();

        for (int i=1; i< arrs.length-1; i++){
            if (   (arrs[i]=='a' &&(arrs[i-1]=='b' && arrs[i+1]=='b')) || (arrs[i]=='b' &&(arrs[i-1]=='a' && arrs[i+1]=='a'))   ){
                dp[i]=dp[i-1]+1;
//                count++;
            }
        }
//        for (char arr : arrs) {
//            arrlsts.add(arr);
//        }
//        System.out.println("Arraylist - "+arrlsts);
//        for (int i=0; i< dp.length; i++){
//            if (dp[i]==1){
//                arrlsts.remove(arrlsts.get(i));
//            }
//        }
        System.out.println("Array     - "+Arrays.toString(arrs));
        System.out.println("Array     - "+Arrays.toString(dp));
//        System.out.println("Arraylist - "+arrlsts);
        int count=0;
        for (int i=0; i<dp.length; i++){
            if (dp[i]==1){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
//        String str = "aababbab";
//        String str = "aababababbbaababa";
//        String str = "bbabababaaabbabab";
        String str = "bbaaaaabbb";
        System.out.println(minimumDeletions(str));
    }
}
