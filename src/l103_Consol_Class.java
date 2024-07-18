//import java.util.*;
import java.io.*;

public class l103_Consol_Class {
    public static void main(String[] args) {
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        Console c = System.console();
        if(c == null) {
            System.out.print("No console available");
            return;
        }
        String name = c.readLine("Enter your name :  ");
        String age = c.readLine("Enter you age : ");
        c.printf("Welcome :  "+name);
        System.out.println("\n");
        c.printf("Your age is : "+age);

        System.out.println("\n---------------------------------------------");

        System.out.println("Enter your Password :  ");
        char[] ch = c.readPassword();
        String pass = String.valueOf(ch);
        System.out.println("Your password was : "+pass);

//        Console c = System.console();
//        System.out.println("Enter the password :  ");
//        char[] ch = c.readPassword();
//        String pass = String.valueOf(ch);
//        System.out.println("Password is :  "+pass);
    }
}
