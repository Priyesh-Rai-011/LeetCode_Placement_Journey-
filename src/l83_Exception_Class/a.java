package l83_Exception_Class;
import java.util.Scanner;
import java.lang.*;
class invalid_AgeException extends Exception{       int age;
    public invalid_AgeException(int age,String msg){        this.age=age;
        System.out.println("Your age is : "+this.age+"........"+msg);
    }
}

public class a {
    public static void main(String[] args) {
        System.out.println("------- Custom Exception -------");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age;
        try {
            age = sc.nextInt();
            if (age < 18 ){
                throw new invalid_AgeException(age,"You can't vote below 18..!");
            }
            else {
                System.out.println("YES.....You can vote..!");
            }
        } catch (invalid_AgeException e){
            System.out.println("OOPS....!     An exception occurred");
        }
    }
}