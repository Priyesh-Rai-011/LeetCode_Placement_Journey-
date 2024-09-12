package LEETCODE_Q.Recursion.theory_AV;

import java.util.ArrayDeque;
import java.util.Deque;

public class T4_SortStack_recursion {
    public static void sortStack(Deque<Integer> stk){
        if(!stk.isEmpty()){
            int x = stk.pollFirst();
            sortStack(stk);
            sortedInsert(stk,x);
        }
    }
    public static void sortedInsert(Deque<Integer> stk, int x){
        if (stk.isEmpty() || x>stk.peekFirst()){
            stk.offerFirst(x);
            return;
        }
//        else {
            int temp = stk.pollFirst();
            sortedInsert(stk,x);
            stk.offerFirst(temp);
//        }
    }
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(30);
        deque.offerFirst(-5);
        deque.offerFirst(18);
        deque.offerFirst(14);
        deque.offerFirst(-3);

        System.out.println(deque);
        sortStack(deque);
        System.out.println(deque);
    }
}
