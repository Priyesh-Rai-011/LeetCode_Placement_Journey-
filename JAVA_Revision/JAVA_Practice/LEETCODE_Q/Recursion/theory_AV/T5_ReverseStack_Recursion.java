package LEETCODE_Q.Recursion.theory_AV;

import java.util.ArrayDeque;
import java.util.Deque;

public class T5_ReverseStack_Recursion {
    public static void reverse(Deque<Integer> stk){
        if(stk.size()>0){
            int x = stk.peekFirst();
            stk.pollFirst();
            reverse(stk);
            insertAtLast(stk,x);
        }
    }
    public static void insertAtLast(Deque<Integer>stk, int x){
        if (stk.isEmpty()){
            stk.offerFirst(x);
        }
        else {
            int a = stk.peekFirst();
            stk.pollFirst();
            insertAtLast(stk, x);
            stk.offerFirst(a);
        }
    }
    public static void main(String[] args) {
        System.out.println("Reversing a stack using recursion : ");
        Deque<Integer> stk = new ArrayDeque<>();
        stk.offerFirst(1);
        stk.offerFirst(3);
        stk.offerFirst(4);
        stk.offerFirst(5);
        stk.offerFirst(7);
        stk.offerFirst(9);
        stk.offerFirst(11);

        System.out.println(stk);
        reverse(stk);
        System.out.println(stk);
    }
}
