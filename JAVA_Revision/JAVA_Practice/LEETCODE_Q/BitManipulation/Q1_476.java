package LEETCODE_Q.BitManipulation;

public class Q1_476 {
    static int findComplement(int num) {
        int count=0,N=num;
        while(num!=0){
            num = num>>1;
            count++;
        }

        return ((int)(Math.pow(2,count)-1) ^ N);
    }
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
}
