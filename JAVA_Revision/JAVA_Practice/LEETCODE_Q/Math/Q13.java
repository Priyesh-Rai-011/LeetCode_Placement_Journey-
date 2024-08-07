package LEETCODE_Q.Math;

public class Q13 {
    public static int countOdds(int low, int high) {
        int cnt=0;
        while (low<high){
            int mid = bs(low,high);
            if (mid%2!=0){cnt++;}
            bs(low,mid);
            bs(mid,high);
        }
        return cnt;
    }
    public static int bs(int l, int h){
        return l+(h-l)>>1;
    }
    public static void main(String[] args) {
        System.out.println(countOdds(3,7));
    }
}
