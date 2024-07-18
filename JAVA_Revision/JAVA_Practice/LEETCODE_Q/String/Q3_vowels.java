package LEETCODE_Q.String;

import java.util.Arrays;
import java.util.Scanner;

// Leetcode 1456
public class Q3_vowels {
    public static int maxVowels(String s, int k) {
        int n = s.length();
        int count=0, v_cnt=0;

        int[] vowel_cnt = new int[n-k+1];

        for (int i=0; i<(n-k+1); i=i+1){
            String sub_s = s.substring(i,i+k);
//            System.out.println("\n"+i+" - "+sub_s);
            for (int j=0; j<sub_s.length(); j++){
                char ch = sub_s.charAt(j);
//                System.out.print(ch+"--");
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    count++;
                }
                vowel_cnt[i] = count;
            }
            count=0;
        }
//        System.out.println(Arrays.toString(vowel_cnt));
        int max=vowel_cnt[0];
        for (int l=0; l<vowel_cnt.length; l++){
            if (vowel_cnt[l] > max){
                max = vowel_cnt[l];
            }
            else if (vowel_cnt[l] == max){
                v_cnt++;
            }
        }
//        System.out.println("-------"+v_cnt);
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Finding number of Vowels in a substring ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : "); String string = sc.nextLine();
        System.out.print("Enter the length of substring : "); int len = sc.nextInt();
//        System.out.println("The String array is : "+"");
        System.out.println("Maximum number of vowel letters in any substring : \n"+maxVowels(string,len));
    }
}
