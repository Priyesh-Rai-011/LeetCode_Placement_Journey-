package LEETCODE_Q.Math;

import java.util.ArrayList;
import java.util.Arrays;

public class Q3_1073_AddingTwoNegaBinary {
    public static int[] addNegabinary(int[] arr1, int[] arr2) {
        int num1=0,num2=0,pow=0,ans;
//  Converting nega binary numbers to integers
        for (int i= arr1.length-1; i>=0; i--,pow++){
            num1 = num1 + (int)(Math.pow(-2,pow))*(arr1[i]);
        }
        pow=0;
        for (int i=arr2.length-1; i>=0; i--,pow++){
            num2 = num2 + (int)((Math.pow(-2,pow))*(arr2[i]));
        }
//        System.out.println(num1);
//        System.out.println(num2);
        ans = num1+num2;
//        System.out.println(ans);
//----------------------------Converting NEGA-BINARY NUMBER TO INT-ARRAY---------------------------------
        ArrayList<Integer> ansarr = new ArrayList<>();
        int k=1;
        if (ans==0){
            ansarr.add(0);
        }
        while (ans!=0){
            if (ans%2==0){
                ansarr.add(0);
            }
            else if (ans%2!=0) {
                ansarr.add(1);
                ans = ans-k;
            }
            k=k*(-1);
            ans=ans/2;
        }
//  ---------------------------------
        int[] sum = new int[ansarr.size()];
        int j=0;
        for (int i=ansarr.size()-1; i>=0; i--){
            sum[j++] = ansarr.get(i);
        }
//        System.out.println("-------------");
//        System.out.println(ansarr);
//        System.out.println("-------------");
        return sum;
    }
    public static void main(String[] args) {
        int[] num1=new int[]{1,1,1,1,1};    int[] num2=new int[]{1,0,1};
//        int[] num1=new int[]{0};    int[] num2=new int[]{1};
//        int[] num1=new int[]{0};    int[] num2=new int[]{0};
        System.out.println(Arrays.toString(addNegabinary(num1, num2)));
    }
}
