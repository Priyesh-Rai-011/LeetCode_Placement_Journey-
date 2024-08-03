package LEETCODE_Q.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q2_ValidParentheses {
    public static boolean isValid(String s) {
        Deque<Character> stk = new ArrayDeque<>();
        for (char c : s.toCharArray()){
            if (c=='(' || c=='{' || c=='['){
                stk.push(c);
            }
            else if(stk.isEmpty() || !match(stk.pop(),c)){
                return false;
            }
        }
        return stk.isEmpty();
    }
    private static boolean match(char a,char b){
        return (a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']');
    }

    public static void main(String[] args) {

    }
}
