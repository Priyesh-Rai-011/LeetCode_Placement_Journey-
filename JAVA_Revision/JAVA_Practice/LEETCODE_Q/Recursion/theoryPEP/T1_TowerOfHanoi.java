package LEETCODE_Q.Recursion.theoryPEP;

public class T1_TowerOfHanoi {
    public static void TOH(int n, char fr, char to, char ax){
        if (n<=0){return;}
        TOH(n-1,fr,ax,to);
        System.out.println(n+" : "+fr+" -> "+to);
        TOH(n-1,ax,to,fr);
        return;  
    }
    public static void main(String[] args) {
//        TOH(3,'A','B','C');
        TOH(4,'A','B', 'C');
    }
}
