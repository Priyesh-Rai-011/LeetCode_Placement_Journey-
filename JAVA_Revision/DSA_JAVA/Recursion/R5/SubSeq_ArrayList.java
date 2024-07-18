package Recursion.R5;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSeq_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : "); String str = sc.nextLine();
        System.out.println("Every possible sub-sequence is : ");
        ArrayList<String> subsequences = subSeq("", str, new ArrayList<>());
        System.out.println(subsequences);
    }
    static ArrayList<String> subSeq(String str1, String str2, ArrayList<String> result) {
        if (str2.isEmpty()) {
            result.add(str1);
            return result;
        }
        char ch = str2.charAt(0);

        ArrayList<String> withChar = subSeq(str1 + ch, str2.substring(1), new ArrayList<>(result));
        ArrayList<String> withoutChar = subSeq(str1, str2.substring(1), new ArrayList<>(result));

        withChar.addAll(withoutChar);

        return withChar;
    }
}
