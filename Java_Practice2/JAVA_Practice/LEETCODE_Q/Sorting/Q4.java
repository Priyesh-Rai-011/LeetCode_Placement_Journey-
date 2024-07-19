package LEETCODE_Q.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static long smallestNumber(long num) {
        long ans;
        boolean isNeg = (num < 0);
        num = Math.abs(num);
        char[] charArr = ("" + num).toCharArray();

        Arrays.sort(charArr);
//        System.out.println(Arrays.toString(charArr));
        if (isNeg){//then it's easy
            StringBuilder ansStr = new StringBuilder();
            for (int i=charArr.length-1; i>=0; i--){
                ansStr.append(charArr[i]);
            }
            ans = - Long.parseLong(ansStr.toString());
        }
        else {
            int i;
            for (i=0; i< charArr.length; i++){
                if (charArr[i] != '0'){
                    break;
                }
            }
            if(i <= (charArr.length-1)){
                char temp = charArr[i];
                charArr[i] = charArr[0];
                charArr[0] = temp;
            }
            String number = String.valueOf(charArr);
            ans = Long.parseLong(number);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");  long num = sc.nextLong();
        System.out.println("Smallest number after re-arranging : "+smallestNumber(num));
    }
}