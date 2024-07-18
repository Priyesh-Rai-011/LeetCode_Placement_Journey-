package Methods;
import java.util.Scanner;

public class Q3_palindrome {
    static void isPalindrome(int num){
        System.out.println("The number is : "+num);
        int origNum = num;
        int revNum = 0;
        while(num != 0){
            int remainder = num % 10;
            revNum = revNum*10 + remainder;
            num = num/10;
        }
        if (origNum == revNum){
            System.out.println("The number is a palindrome");
        }
        else {
            System.out.println("The number is not a palindrome");
        }
    }

    static void isPalindrome(String str){
        int left=0;
        int right = str.length()-1;

        while(left<right){
            if (str.charAt(left) != str.charAt(right)){
                System.out.println("String is not a palindrome");
            }
            else {
                System.out.println("String is a palindrome");
            }
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        System.out.println("----  Checking if the number is a palindrome or not  ----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        isPalindrome(num);

        System.out.print("Enter a String : ");
        String str = sc.next();
        isPalindrome(str);
    }
}
