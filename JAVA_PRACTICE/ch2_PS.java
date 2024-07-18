import java.util.Scanner;
import Lab4.*;
public class ch2_PS {
    public static void main(String[] args) {
//  Question 1
//        System.out.println("Hello..!");
//        float a = 7/4.0f*9/2.0f;
//        System.out.println(a);
//  Question 2
//        char grade = 'B';
//        grade = (char)(grade+8);
//        System.out.println(grade);
////      Decrypting....the grade
//        grade = (char)(grade-8);
//        System.out.println(grade);
//  Question 3
        System.out.println("We are given a number (a) : ");
        double a = 21.814;
        System.out.print("Now ... Enter any number... :");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        System.out.println(b>a);
        System.out.println("True : Number is greater than 21.814.");
        System.out.println("False : Number is smaller than 21.814.");
    }
}
