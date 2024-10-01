package LEETCODE_Q.String;

import java.util.ArrayList;
import java.util.List;

public class Q16_1023_CamelcaseMatching {
    public static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res = new ArrayList<>();
        for (var q : queries){
            res.add(check(q,pattern));
        }
        return res;
    }
    public static boolean check(String s, String p){
        int s_len=s.length(), p_len=p.length();
        int i=0,j=0;
        for (; j<p_len; ++i,++j){
            while (i<s_len && s.charAt(i)!= p.charAt(j) && Character.isLowerCase(s.charAt(i))){
                ++i;
            }
            if (i==s_len || s.charAt(i) != p.charAt(j)){
                return false;
            }
        }
        while (i<s_len && Character.isLowerCase(s.charAt(i))){
            ++i;
        }
        return i==s_len;
    }
    public static void main(String[] args) {
        String[] queries = {"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"};
        String pattern = "FoBaT";

        List<Boolean> result = camelMatch(queries, pattern);
        System.out.println(result); // Output: [false, true, false, false, false]
    }
}
