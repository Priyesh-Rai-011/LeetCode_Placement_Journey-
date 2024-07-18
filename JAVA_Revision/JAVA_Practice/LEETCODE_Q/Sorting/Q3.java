package LEETCODE_Q.Sorting;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for (int i=0; i< strNums.length; i++){
            strNums[i] = nums[i]+"";
        }
//        Arrays.sort(strNums);
        Arrays.sort(strNums,(a,b)->{
            long n1 = Long.parseLong(a+b);
            long n2 = Long.parseLong(b+a);

            if(n1>n2)       {  return 1;  }
            else if (n1<n2) {  return -1; }
            else            {  return 0;  }
        }                                );

        StringBuilder ans = new StringBuilder();
//        System.out.println(Arrays.toString(strNums));
        for (int i=strNums.length-1;i>=0;i--){
            ans.append(strNums[i]);
//            ans.append(strNums[i]).append("_");
        }
        if(ans.charAt(0) == '0'){
            return "0";
        }
//        return String.valueOf(ans);
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number :");  int num = sc.nextInt();
        int[] int_num = new int[]{3,30,34,5,9};
//        int[] int_num = new int[]{1000000000,1000000000};
//        int[] int_num = new int[]{3,30,34,5,9,13,98,793,2,4,58,19,27,53,90,16,23,91,90,74,28,74,12};
        System.out.println("The given array is : "+Arrays.toString(int_num));
        System.out.println(largestNumber(int_num));
    }
}
