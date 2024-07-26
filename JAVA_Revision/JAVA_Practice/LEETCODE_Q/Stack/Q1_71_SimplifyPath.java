package LEETCODE_Q.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Q1_71_SimplifyPath {
    // VERY IMPORTANT LEARNING IN THIS QUESTION
    // THIS QUESTION IS NOT FROM MONOTONIC STACK
    // IT IS FROM NORMAL STACK
    // REVISE THE REASON - WHY WE USED OFFERLAST() AND POLLLAST()
    //                       INSTED OF PUSH()      AND POP() -->  WHILE USING DEQUEUE
    public static String simplifyPath(String path){
        String[] dirs = path.split("/");
        System.out.println("-->"+Arrays.toString(dirs));
//        Stack<String> stk = new Stack<>();
        Deque<String> stk = new ArrayDeque<>();
        for (int i=0; i<dirs.length; i++){
            if (dirs[i].equalsIgnoreCase(".") || dirs[i].isEmpty()){
                continue;
            }
            if (dirs[i].equalsIgnoreCase("..")&& !stk.isEmpty()){
//                stk.pop();
                stk.pollLast();
            }
            else {
//                stk.push(dirs[i]);
                stk.offerLast(dirs[i]);
            }
            System.out.print(stk+"-->");
        }
        System.out.println();
        System.out.println("-->"+Arrays.toString(dirs));
        System.out.println(stk);

        return "/"+String.join("/",stk);
    }
    public static void main(String[] args) {
//        System.out.println(simplifyPath("/home/"));
//        System.out.println(simplifyPath("/home//foo/"));
        System.out.println(simplifyPath("/home/users/Document/../Pictures"));
//        System.out.println(simplifyPath("/../"));
    }
}
