package LEETCODE_Q.Math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q14_386_LexicographicalNumbers {
    public static List<Integer> lexicalOrder(int n){
        List<Integer> res = new ArrayList<>();
        int v=1;
        for (int i=0; i<n; i++){
            res.add(v);
            if (v*10 < n){
                v*=10;
            }
            else {
                while (v%10 == 9 || v+1>n){
                    v/=10;
                }
                v++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Finding te lexicographical order of the number : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter teh number : "); int n = sc.nextInt();
        System.out.println("The lexical order is : ");
        System.out.println(lexicalOrder(n));
    }
}
