import java.util.Scanner;
public class l5_takingInputs {
    public static void main(String[] args) {
        System.out.println("It Works...!");
        System.out.println("Taking input from the user..!");
        System.out.println("Enter any number : ");        Scanner sc = new Scanner(System.in);

//  To take input from the user...
//        System.out.print("Enter number 1 : ");        int a = sc.nextInt();
//        System.out.print("Enter number 2 : ");        int b = sc.nextInt();
//        int s = a+b;
//        System.out.print("The sum of these number is : "+s);
//  To check weather a number is integer or not.
        boolean b1 = sc.hasNextInt();          System.out.println(b1);
        boolean b2 = sc.hasNextFloat();        System.out.println(b2);
    }
}
