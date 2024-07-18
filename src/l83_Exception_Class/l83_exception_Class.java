package l83_Exception_Class;
import java.util.Scanner;

public class l83_exception_Class {
    private static void valid_age(int age) throws AgeException {
        if (age<=0){
            throw new AgeException(age,"Please enter a correct age .......");
        }
        if (age<18){
            throw new AgeException(age,"You are below 18.....you can't vote");
//            System.out.println("You are below 18 -- you can't vote");
        }
    }

    public static void main(String[] args) throws AgeException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age.... : ");
        int a = sc.nextInt();
        System.out.println("---------------------------");
        valid_age(a);
    }
}
