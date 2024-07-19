package LEETCODE_Q.String;
//LeetCode Q : 412
//Link : https://leetcode.com/problems/fizz-buzz/description/

//Given an integer n, return a string array answer (1-indexed) where:
//
//answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//answer[i] == "Fizz" if i is divisible by 3.
//answer[i] == "Buzz" if i is divisible by 5.
//answer[i] == i (as a string) if none of the above conditions are true.
//
//
//Example 1:
//
//Input: n = 3
//Output: ["1","2","Fizz"]
//Example 2:
//
//Input: n = 5
//Output: ["1","2","Fizz","4","Buzz"]
//Example 3:
//
//Input: n = 15
//Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
import java.util.ArrayList;
import java.util.Scanner;

public class Q1_FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the string : ");  int len = sc.nextInt();
        System.out.println("The Array is as follows : ");
        System.out.println(fizzBuzz(len));
    }
    public static ArrayList<String> fizzBuzz(int n){
        ArrayList<String> list = new ArrayList<>();
        for (int i=1; i<=n; i++){
            String s = "";
            if (i%3==0){
                s+="Fizz";
            }
            if (i%5==0){
                s+="Buzz";
            }
//            if (i%3==0 && i%5==0){
//                s+="FizzBuzz";
//            }
            else if (s.length()==0) {
                s=s+i;
            }
            list.add(s);
        }
        return list;
    }
}
