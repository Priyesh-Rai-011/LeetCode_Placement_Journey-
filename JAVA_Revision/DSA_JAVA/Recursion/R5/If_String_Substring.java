package Recursion.R5;

import java.util.Scanner;

public class If_String_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1 : "); String str1 = sc.nextLine();
        System.out.print("Enter string 2 : "); String str2 = sc.nextLine();
        boolean result = ifSubset(str1,str2);
        if (result==true){
            System.out.println("str2 is subset str1.");
        }
        else {
            System.out.println("str2 is not the subset str1.");
        }
    }
    static boolean ifSubset(String str1, String str2){
        if (str2.isEmpty()){
            return true;//Empty string is subset of every string
        }
        if (str1.isEmpty() || str1.length()<str2.length()){
            return false;//str2 can't be subset of str1 if it's length is greater
        }
        return ifSubsetHelper(str1,str2,0);
    }
    private static boolean ifSubsetHelper(String str1, String str2, int index) {
        if (index == str2.length()){
            return true;//all characters of string are checked
        }
        char c = str2.charAt(index);
        for (int i=0; i<str1.length(); i++){
            if (str1.charAt(i) == c){
                return ifSubsetHelper(str1,str2,index+1);
            }
        }
        return false;
    }
}
