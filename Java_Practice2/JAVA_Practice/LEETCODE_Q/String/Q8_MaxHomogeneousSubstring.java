package LEETCODE_Q.String;


import java.util.ArrayList;

public class Q8_MaxHomogeneousSubstring {
    public int countHomogenous(String s) {
        int n=0,length=1;
        ArrayList<Integer> len = new ArrayList<>();
        for (int i=1; i<s.length(); i++){
            if (s.charAt(i) == s.charAt(i-1)){
                length++;
            }
            else {
                len.add(length);
                length=1;
            }
        }
        len.add(length);
        for (int i=0; i<len.size(); i++){
            int num = len.get(i);
            len.set(i, (num * (num + 1)) / 2);
            n=n+len.get(i);
        }
//        System.out.println(len);
        int kmod = (int)1e9+7;
        n=n%kmod;
        return n;
    }
    public static void main(String[] args) {
        Q8_MaxHomogeneousSubstring obj = new Q8_MaxHomogeneousSubstring();
        String str = "abbcccaa";
        System.out.println("The string is : "+str);
        System.out.println(obj.countHomogenous(str));
    }
}
