package LEETCODE_Q.Stack.Monotonous_Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q3_LongestValidParentheses {
    public static int longestParen(String s) {
        int count=0;
        Deque<Character> stk = new ArrayDeque<>();
        for (char c : s.toCharArray()){
            if (c=='(' || c=='{' || c=='['){
                stk.push(c);
                count+=2;
            }
            else if(stk.isEmpty() || !match(stk.pop(),c)){
                count=0;
            }
        }
        return count;
    }
    private static boolean match(char a,char b){
        return (a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']');
    }

    public static void main(String[] args) {
        System.out.println(longestParen("(()()"));
    }
}
