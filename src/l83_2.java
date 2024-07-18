import l83_Exception_Class.AgeException;

import java.util.Scanner;
import java.util.Scanner;
public class l83_2 {
    public static int display_age(int age){
        System.out.println("-------------------");
        System.out.println("-------------------");
        System.out.println("Your age is : ");
        System.out.println("-------------------");
        System.out.println("-------------------");
        return age;
    }
    public static void main(String[] args){
        System.out.println("------ Custom exception -------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        try{
            int age = sc.nextInt();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
