package Recursion.R5;

import MathsForDSA.V1._addTwoBinaryNumbers;

import java.util.Scanner;

public class SkipString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre the string : ");  String str = sc.nextLine();
        System.out.println("String after skipping 'Apple'             : "+skipApple(str));
        System.out.println("String after skipping 'Apple' & not 'App' : "+skipApple_NotApp(str));
    }
    static String skipApple(String str){
        if (str.isEmpty()){
            return "";
        }
        if (str.startsWith("apple")){
            return skipApple(str.substring(5));
        }
        else {
            return str.charAt(0)+skipApple(str.substring(1));
        }
    }
    static String skipApple_NotApp(String str){
        if (str.isEmpty()){
            return "";
        }
        if (str.startsWith("app") && !str.startsWith("apple")){
            return skipApple_NotApp(str.substring(5));
        }
        else {
            return str.charAt(0)+skipApple_NotApp(str.substring(1));
        }
    }
}
