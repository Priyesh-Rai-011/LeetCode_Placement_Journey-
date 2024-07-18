package Lab4;
import java.util.Scanner;

public class Q3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int rem,tempn=n;
        int rev=0;
        while (tempn != 0){
            rem = tempn%10;
            tempn = tempn/10;
            rev = rev*10+rem;
        }
        if (rev == n){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
