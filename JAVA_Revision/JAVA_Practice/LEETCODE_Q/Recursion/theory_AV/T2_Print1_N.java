package LEETCODE_Q.Recursion.theory_AV;

public class T2_Print1_N {
    static void print1_n(int n){
        if (n==1){
            System.out.println("1");
            return;
        }
        print1_n(n-1);
        System.out.println(n);
    }
    static void printn_1(int n){
        if (n==1){
            System.out.println("1");
            return ;
        }
        System.out.println(n);
        printn_1(n-1);
    }
    public static void main(String[] args){
        print1_n(7);
        printn_1(7);
    }
}
