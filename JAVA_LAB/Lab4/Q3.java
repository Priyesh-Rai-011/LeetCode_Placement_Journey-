package Lab4;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        System.out.println("---- Palindrome ----");
        System.out.print("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        float reverse = 0;
        int rem,temp ;
        temp=n1;
        while(temp != 0){
            rem = temp%10;
            reverse = reverse*10+rem;
            temp = temp/10;
        }
        if (n1 == reverse){
            System.out.println("The number is ---> PALINDROME");
        }
        else {
            System.out.println("The number is ---> not a PALINDROME");
        }
    }
}
