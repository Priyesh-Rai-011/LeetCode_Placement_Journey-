package LEETCODE_Q.TwoPointers;


public class Q2_541_ReverseString2 {
    public static String reverseStr(String s, int k) {
        int n = s.length();
        char[] arr = s.toCharArray();
        for (int i = 0; i < n; i += (2 * k)) {
            if(i+k-1>=n){
                Reverse(arr,i,n-1);
            }
            Reverse(arr,i,i+k-1);
        }
        return new String(arr);
    }

    public static void Reverse(char[] arr, int b, int e) {
        for (int i = 0; i < (e - b + 1) / 2; i++) {
            char t = arr[b + i];
            arr[b + i] = arr[e - i];
            arr[e - i] = t;
        }
    }
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdef",2));
//        String a = "abcdefghijk";
//        System.out.println(rev(a,0,3));
    }
}
