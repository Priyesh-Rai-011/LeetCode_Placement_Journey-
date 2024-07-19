package LEETCODE_Q.Math;
//LeetCode Q :
import java.util.Scanner;

public class Q1_Categorize_Box {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length, Width & Height : ");
        int length = sc.nextInt(), width=sc.nextInt(), height=sc.nextInt();
        System.out.println("Enter Mass : ");
        int mass = sc.nextInt();
        System.out.println("-----------------");
        System.out.println(categorizeBox(length,width,height,mass));
    }
    public static String categorizeBox(int length, int width, int height, int mass) {
        long vol = (long) length*width*height;
        boolean bulky = length>10000||width>10000||height>10000||vol>1000000000;
        boolean heavy = mass>100;
        if (bulky && heavy){
            return "Both";
        }
        if (bulky){
            return "bulky";
        } else if (heavy){
            return "Heavy";
        }
        return "Neither";
    }
}
