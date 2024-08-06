package LEETCODE_Q.Math;

public class Q8_2180_CountInt_EvenDigitSum {
    public static int countEven(int num) {
        int ans=0;
        for(int i=1; i<=num; i++){
            if (isSumEven(i)){
                ans++;
            }
        }
        return ans;
    }
    public static boolean isSumEven(int num){
        int sum=0;
        while (num>0){
            sum+=num%10;
            num/=10;
        }
        return sum % 2 == 0;
    }
    public static void main(String[] args) {
        System.out.println(countEven(4));
        System.out.println(countEven(30));
    }
}
