package LEETCODE_Q.String;

import java.util.Arrays;

public class Q19_557_ReverseWordsInAString {
    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i=0 ;i< arr.length-1; i++){
//            arr[i] = rev(arr[i]);
            res.append(rev(arr[i])).append(" ");
        }
        res.append(rev(arr[arr.length-1]));
        return res.toString();
//        return "";
    }
    private static String rev(String org){
        char[] arr = org.toCharArray();
        int l=0,r= arr.length-1;
        while (l<r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;r--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
