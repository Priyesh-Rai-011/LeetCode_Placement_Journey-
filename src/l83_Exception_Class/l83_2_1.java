package l83_Exception_Class;
import java.util.Scanner;


public class l83_2_1 {
    public static int display_age(int age){
        System.out.println("-------------------");
        System.out.println("-------------------");
        System.out.println("Your age is : ");
        System.out.println("-------------------");
        System.out.println("-------------------");
        return age;
    }
    public static void main(String[] args) {
        System.out.println("------ Custom exception -------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
//        display_age();
        display_age(age);
        System.out.println(display_age(age));
    }
}
