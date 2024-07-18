package Lab4;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        System.out.println("---- Printing Name ----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First name : ");
        String name1 = sc.next();
        System.out.print("Enter your Last name : ");
        String name2 = sc.next();
        System.out.println("Your name was : "+name1+" "+name2);
        System.out.println("----------------------------------");
        System.out.println("Now your name is : "+name2+" "+name1);
    }
}
