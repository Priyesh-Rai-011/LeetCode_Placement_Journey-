package Methods;
import java.util.Scanner;

public class q2 {
    static void reverseString(String s){
        System.out.println("You string is : "+s);

        System.out.print("Reverce of the string is :");
        for (int i=s.length()-1; i>=0;i--){
            System.out.print(s.charAt(i));
        }System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("----  Reversing a string  ----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String st = sc.next();

        reverseString(st);
    }
}
