package LEETCODE_Q.String;

public class Q4_Appearance_of_all_A_before_B {
    public static boolean checkString(String s) {
        char[] s_arr = s.toCharArray();
        for (int i=0; i< s_arr.length-1; i++){
            if (s_arr[i]=='b' && s_arr[i+1]=='a'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkString("aaa"));
        System.out.println(checkString("aababb"));
        System.out.println(checkString("abaabb"));
        System.out.println(checkString("baaabb"));
        System.out.println(checkString("aaabbb"));
        System.out.println(checkString("bbb"));
    }
}
