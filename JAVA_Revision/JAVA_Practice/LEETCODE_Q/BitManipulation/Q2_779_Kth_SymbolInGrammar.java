package LEETCODE_Q.BitManipulation;

public class Q2_779_Kth_SymbolInGrammar {
    static int kthGrammar(int n, int k) {
        if(n==1 || k==1){
            return 0;
        }
        if( k < (1<<(n-2)) ){
            return kthGrammar(n-1,k);
        }
        else {
            return kthGrammar(n-1,(k - (1<<n-2))) ^ 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(kthGrammar(5,3));
//        System.out.println(kthGrammar(5,4));
//        System.out.println(kthGrammar(5,5));
        System.out.println(kthGrammar(2,1));
    }
}
