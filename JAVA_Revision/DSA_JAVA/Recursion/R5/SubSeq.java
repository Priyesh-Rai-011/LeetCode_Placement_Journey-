package Recursion.R5;

import javax.xml.transform.Source;
import java.util.Scanner;

public class SubSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : "); String str = sc.nextLine();
        System.out.println("Every possible sub-sequence is : ");
        subSeq("",str);
    }
    static void subSeq(String str1,String str2){
        if (str2.isEmpty()){
            System.out.println(str1);
            return;
        }
        char ch = str2.charAt(0);

        subSeq(str1+ch,str2.substring(1));
        subSeq(str1,str2.substring(1));
    }
}
